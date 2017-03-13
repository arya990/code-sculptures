package week3.mar6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//count the number of scanners used in a directory
public class ScannerSearch {
	public int count = 0;

	public static void main(String[] args) {

		new ScannerSearch().code();

	}

	public void code() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		File file = new File("E:/workspace/code-sculptures/src/week1/numberoperations");
		String[] insideDir = file.list();

		for (int i = 0; i < insideDir.length; i++) {
			String filename = insideDir[i];

			if (filename != null) {
				search("E:/workspace/code-sculptures/src/week1/numberoperations/" + filename, str);
			}
		}
		System.out.println(count);
		in.close();
	}

	public boolean search(String filepath, String str) {
		BufferedReader br;
		boolean result = false;
		try {
			br = new BufferedReader(new FileReader(filepath));

			String line = " ";
			while ((line = br.readLine()) != null) {
				if (line.contains(str)) {
					result = true;
					count++;
				}
			}
			// System.out.println(count);
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
