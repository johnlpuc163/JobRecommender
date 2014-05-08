import java.io.*;
import org.apache.pig.PigServer;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.pig.impl.util.WrappedIOException;

/**how to run 
****include pig.jar
****set correct path of Corr.jar -- udfPath
****set correct path of input file -- inputPath
****set correct path of database file --dataBasePath
*/
public class parseFeature {
	
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
		

	
	private PigServer pigServer;
	private String result;
	
	public String topN = "40";
	public String udfPath = "Corr.jar";
	public String inputPath = "input.txt";
	public String dataBasePath = "dataBase.txt";
	public String outputDir = "out";
	public String outputFile = "out/part-r-00000";
		
	public void initPig(){
		try {
			pigServer = new PigServer("local");
			pigServer.registerJar(udfPath);
			pigServer.registerQuery("A = load '" + inputPath + "' using PigStorage('\t') AS (jobID: chararray, jobFeature: chararray);");
			pigServer.registerQuery("DB = load '" + dataBasePath + "' using PigStorage('%') AS (ID: chararray,x1:chararray,x2:chararray, feature: chararray);");
		}
		catch(Exception e) {
	    }
	}
	
	public String query(String usrFeature){
		try {
			//launch query
			pigServer.registerQuery("B = foreach A generate jobID, Corr.Corr(jobFeature,'"+usrFeature+"') as similarity;"); 
		    pigServer.registerQuery("C = ORDER B BY similarity DESC;");
		    pigServer.registerQuery("D = LIMIT C "+topN+";");	
		    
		    pigServer.registerQuery("T = JOIN D BY $0, DB  by $0;");
			pigServer.registerQuery("R = foreach T generate $0, $5;");
			
		    //delete output directory
			File directory = new File(outputDir);
			if(directory.exists()){
				delete(directory);
			}
			//store to local, toggle execution
			pigServer.store("R", outputDir);
			
			//read result;
			result ="";
			FileInputStream fis = new FileInputStream(outputFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = br.readLine();
			while(line != null){
				result += line+"\n";
				line = br.readLine();
			}
			
			//finish job
			br.close();
			fis.close();
			delete(directory);
			
			
		}
		catch(Exception e) {
	    }
		return result;
	}
	
	public void writeResultToLocal(){
		try {
			//delete output directory
			File directory = new File(outputDir);
			if(directory.exists()){
				delete(directory);
			}
			pigServer.store("D", outputDir);
		}
		catch(Exception e) {
	    }
	}
		
	private  void delete(File file)
	    	throws IOException{
	 
	    	if(file.isDirectory()){
	 
	    		//directory is empty, then delete it
	    		if(file.list().length==0){
	 
	    		   file.delete();
	    		   System.out.println("Directory is deleted : " 
	                                                 + file.getAbsolutePath());
	 
	    		}else{
	 
	    		   //list all the directory contents
	        	   String files[] = file.list();
	 
	        	   for (String temp : files) {
	        	      //construct the file structure
	        	      File fileDelete = new File(file, temp);
	 
	        	      //recursive delete
	        	     delete(fileDelete);
	        	   }
	 
	        	   //check the directory again, if empty then delete it
	        	   if(file.list().length==0){
	           	     file.delete();
	        	     System.out.println("Directory is deleted : " 
	                                                  + file.getAbsolutePath());
	        	   }
	    		}
	 
	    	}else{
	    		//if file, then delete it
	    		file.delete();
	    		System.out.println("File is deleted : " + file.getAbsolutePath());
	    	}
	    }
	
	public String getUserFeature(String input){
		String retval = buildFeature(input,keywords);;
		
		return retval;
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
		String [] delimiter ={" ", ",", ".", "\n"};
		String newKeyword;
		for(int i = 0; i<delimiter.length; i++){
			newKeyword = " " + keyword + delimiter[i];
			if(input.contains(newKeyword)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {	
		
        Interface gui = new Interface();
        
        
		parseFeature featureParser = new parseFeature();
		featureParser.initPig();
		
		gui.featureParser = featureParser;
		
		gui.launchFrame();
		
//		String userInput = "user resume";
//		String usrFeature = featureParser.getUserFeature(userInput);
//		
//		String result = featureParser.query(usrFeature);
//		
//		System.out.println(result);
		
	}
	
}

//usrFeature = "0000010000000010000000100000010000010000000000000010000000000000000000100000000";  //FOR TEST