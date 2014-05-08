package keywordExtracter;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class keywordExtracterReducer extends
		Reducer<Text, Text, Text, Text> {

	@Override
	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {
		StringBuilder sb = new StringBuilder();
		boolean ishead = true;
		for (Text value : values) {
			if(ishead){
				sb = new StringBuilder(value.toString());
				ishead = false;
			}
			else{
				String feature = value.toString();
				for(int i=0; i<sb.length();i++){
					if(sb.charAt(i)=='0' && feature.charAt(i)=='1'){
						sb.setCharAt(i, '1');
					}
				}
			}
		}
		context.write(key, new Text(sb.toString()));
	}

}
