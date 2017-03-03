package week1.textfileprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//create a string of file 100mb

public class CreateStringFile {
	private static final String FILENAME = "C:\\Users\\basha\\Desktop\\string.txt";

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			for (int i = 1; i < 25000000; i++) {
				String content = "mom";

				bw.write(content);
				bw.newLine();
			}
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
