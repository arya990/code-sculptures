package readingdifferentfileformats;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//Read Json File, and print to console

public class ReadingGOTJsonFile {

	public static final String delimiter = ",";
	public static final String new_line = "\n";
	public static final String Header = "id,url,name,season,number,airdate,airstamp,airtime,runtime,summary";

	public static void main(String[] args) {

		JsonParser parser = new JsonParser();
		List<GotClassFile> l = new ArrayList<GotClassFile>();
		try {
			JsonElement jElement = parser.parse(new FileReader(new File("E:\\workspace\\textfile\\got.json")));
			JsonObject jObject = jElement.getAsJsonObject();
			JsonObject embedded = jObject.get("_embedded").getAsJsonObject();
			JsonArray episodes = embedded.get("episodes").getAsJsonArray();

			// System.out.println(jObject);
			// System.out.println(embedded);
			// System.out.println(episodes.size());

			for (JsonElement episode : episodes) {
				JsonObject jsonObject = episode.getAsJsonObject();

				GotClassFile classFile = new GotClassFile(jsonObject.get("id").getAsString(),
						jsonObject.get("url").getAsString(), jsonObject.get("name").getAsString(),
						jsonObject.get("season").getAsString(), jsonObject.get("number").getAsString(),
						jsonObject.get("airdate").getAsString(), jsonObject.get("airstamp").getAsString(),
						jsonObject.get("airtime").getAsString(), jsonObject.get("runtime").getAsString(),
						jsonObject.get("summary").toString());
				l.add(classFile);
			}

			FileWriter fileWriter = new FileWriter(new File("E:\\workspace\\textfile\\Got.csv"));
			fileWriter.append(Header);
			fileWriter.append(new_line);

			for (GotClassFile f : l) {

				fileWriter.append("\"" + f.getId() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getUrl() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getName() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getSeason() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getNumber() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getAirdate() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getAirstamp() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getAirtime() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getRuntime() + "\"");
				fileWriter.append(delimiter);
				fileWriter.append("\"" + f.getsummary() + "\"");
				fileWriter.append(new_line);

			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
