package ioprograms;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

//FilterIOStreamImplementation
public class FilterIOStreamImplementation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int i = 0;
		char c;
		try {
			FilterInputStream fis = new BufferedInputStream(new FileInputStream("E:\\workspace\\textfile\\tasks.txt"));
			while ((i = fis.read()) != -1) {
				c = (char) i;
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String content = "This is the text content";
		try {
			File file = new File("E:\\workspace\\textfile\\newfile.txt");
			FileOutputStream fos = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] contentBytes = content.getBytes();
			fos.write(contentBytes);
			fos.flush();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
