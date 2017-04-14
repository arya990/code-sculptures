package moviedataexcercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//converting a text file to json format
public class MovieDatatoJson {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("E:\\workspace\\textfile\\vote.txt"));
			String str;
			ArrayList<ModelData> data = new ArrayList<ModelData>();

			Gson gson = new Gson();

			while ((str = br.readLine()) != null) {
				ModelData modelData = new ModelData();
				String[] parts = str.split("\t");
				modelData.setUserId(Integer.parseInt(parts[0]));
				modelData.setMovieid(Integer.parseInt(parts[1]));
				modelData.setRating(Double.parseDouble(parts[2]));
				modelData.setJunk(Double.parseDouble(parts[3]));
				modelData.setTimestamp(parts[4]);

				data.add(modelData);
			}
			FileWriter fileWriter = new FileWriter(new File("E:\\workspace\\textfile\\vote.json"));

			for (ModelData data2 : data) {

				gson = new GsonBuilder().setPrettyPrinting().create();
				String prettyJson = gson.toJson(data2);

				System.out.println(prettyJson);

				fileWriter.append(prettyJson);
			}
			br.close();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
