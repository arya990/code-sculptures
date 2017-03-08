package ioprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//InputandOutputStreamReaderWriter
public class InputandOutputStreamReaderWriter {

	public static void main(String[] args) {

		char c;
		int i;
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(
					new FileInputStream("E:\\workspace\\textfile\\tasks.txt"));
			while ((i = inputStreamReader.read()) != -1) {
				c = (char) i;
				System.out.print(c);
			}
			inputStreamReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String content = "ismail basha";
		try {
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
					new FileOutputStream("E:\\workspace\\textfile\\newfile.txt"));
			outputStreamWriter.write(content);
			outputStreamWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
