package week3.mar10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		try {
			File file = new File("E:/workspace/textfile/tasks.txt");
			Scanner in = new Scanner(file);

			int words = 0;
			int lines = 0;
			int chars = 0;

			while (in.hasNextLine()) {
				lines++;
				String line = in.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) != ' ' && line.charAt(i) != '\n')
						chars++;
				}
				words =words + new StringTokenizer(line, " ,").countTokens();
			}

			System.out.println("Number of lines: " + lines);
			System.out.println("Number of words: " + words);
			System.out.println("Number of characters: " + chars);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
