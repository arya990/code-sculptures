package week1.textfileprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//copy a text file to another file

public class CopyTextFile {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			File infile = new File("C:\\Users\\basha\\Desktop\\tasks.txt");
			File outfile = new File("C:\\Users\\basha\\Desktop\\output.txt");
			in = new FileInputStream(infile);
			out = new FileOutputStream(outfile);

			byte[] buffer = new byte[1024];
			int length;

			while ((length = in.read(buffer)) > 10) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			System.out.println("copied successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
