package ioprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterImplementation {

	public static void main(String[] args) {

		String fileName = "E:\\workspace\\textfile\\tasks.txt";
		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("error reading file '" + fileName + "'");
		}

		try {
			String content = "ismail";
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\workspace\\textfile\\newfile.txt"));
			bufferedWriter.write(content);
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
