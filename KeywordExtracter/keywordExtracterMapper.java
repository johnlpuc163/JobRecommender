package keywordExtracter;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;
public class keywordExtracterMapper extends
		Mapper<LongWritable, Text, Text, Text> {
	//String [] keywords = {"javascript", "java", "php", "seo","C#","sQl"};
	String [] keywords = {"Ajax",".Net", "C#", "ObjectC", "Bash", "Linux", "MangoDB", "Hadoop", "PIG", "Scala", "Functional Language", "JUnit", "Intelij", "Eclipse", "Visual Studio", "Vim",
			"AutoCAD","Android", "APIs","Backup Management","C",
			"C++",
			"Client Server",
			"CSS",
			"Data Analytics",
			"Excel",
			"FileMaker Pro",
			"Fortran",
			"HTML",
			"iOS",
			"iPhone",
			"Linux",
			"Java",
			"Javascript",
			"Mac",
			"Matlab",
			"Maya",
			"Mobile",
			"MySQL",
			"Networks",
			"Open Source Software",
			"Oracle",
			"Perl",
			"PHP",
			"Processing",
			"PT Modeler",
			"Python",
			"Quick Books Pro",
			"Ruby",
			"SQL",
			"Support",
			"Systems Administration",
			"Unix",
			"Web Page Design",
			"Windows",
			"XML",
			"XHTML"};
	
	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		
		String line = value.toString();
		if (line.length() < 1)
			return;
		String [] sp = line.split("%%%");
		
		String feature = buildFeature(sp[1],keywords);
		//if(Integer.parseInt(feature) != 0){
		if(feature.contains("1")){
			context.write(new Text(sp[0]), new Text(feature));
		}
		
	
	}
	
	private String buildFeature(String input, String [] keywords){
		StringBuilder sb = new StringBuilder();
		input = input.toLowerCase();
		for(String keyword : keywords){
			if(containsString(input,keyword.toLowerCase())){
				sb.append("1");
			}
			else{
				sb.append("0");
			}
		}
		return sb.toString();
	}
	
	private boolean containsString(String input, String keyword)
	{
		String [] delimiter ={" ", ",", "."};
		String newKeyword;
		for(int i = 0; i<delimiter.length; i++){
			newKeyword = " " + keyword + delimiter[i];
			if(input.contains(newKeyword)){
				return true;
			}
		}
		return false;
	}

}
