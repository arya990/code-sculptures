package moviedataexcercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MovieDataClass {

	public static void main(String[] args) {
		
		ArrayList<ModelData> datas=new ArrayList<ModelData>();
		Set<Integer> list = new HashSet<Integer>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\basha\\Desktop\\Vote.txt"));

			String line = " ";
			while ((line = br.readLine()) != null) {
				ModelData data=new ModelData();
				
				String [] str=line.split("\t");
				data.setUserId(Integer.parseInt(str[0]));
				data.setMovieid(Integer.parseInt(str[1]));
				data.setRating(Double.parseDouble(str[2]));
				data.setJunk(Double.parseDouble(str[3]));
				data.setTimestamp(str[4]);
				
				datas.add(data);	
			}
			br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		for(ModelData a: datas){
			list.add(a.getUserId());
			System.out.println(a.getUserId());
		}
		 

	}

}
