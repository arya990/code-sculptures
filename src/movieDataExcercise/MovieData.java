package movieDataExcercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MovieData {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\basha\\Desktop\\Vote.txt"));

			String line = " ";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}

	}

}
