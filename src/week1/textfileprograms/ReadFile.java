package week1.textfileprograms;

import java.io.IOException;
import java.io.*;
//write a program to read a text file

public class ReadFile {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\basha\\Desktop\\tasks.txt";
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

	}

}
