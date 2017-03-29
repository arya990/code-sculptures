package readingdifferentfileformats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//Read Json File, and print to console

public class ReadingGOTJsonFile {

	public static void main(String[] args) {

		JsonParser jsonParser = new JsonParser();

		try {
			BufferedReader br = new BufferedReader(new FileReader("E:\\workspace\\textfile\\got.json"));
			String line;
			while ((line = br.readLine()) != null) {
				JsonObject jsonObject = (JsonObject) jsonParser.parse(line);
				// System.out.println(jsonObject);

				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String prettyJson = gson.toJson(jsonObject);

				System.out.println(prettyJson);

//				JsonArray jsonArray = jsonObject.getAsJsonArray("season");
//				for (int i = 0; i < jsonArray.size(); i++) {
//					JsonObject object = jsonArray.getAsJsonObject(i);
//					
//				}
//				System.out.println(jsonArray);
				
//				Iterator iterator=jsonArray.iterator();
//                int i=0;
//             while iterator(hasNext()) 
//               {
//               JsonObject object=(JsonObject) iterator.next();
//                 System.out.println(object);
//                i++;
//               }
//              System.out.println("length of json array is :"+i);
				
              
              
//				 JsonElement count = jsonObject.get("season");
//				 System.out.println(count);
				 
//				JsonObject job = gson.fromJson(prettyJson, JsonObject.class);
//				JsonElement entry=job.getAsJsonObject("_embedded").getAsJsonArray("episodes");
//
//				String str = entry.toString();
//
//				System.out.println(str);
				 
				 
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
