package ioprograms;

import java.io.StringReader;
import java.io.StringWriter;

//StringReaderWriterImplementation
public class StringReaderWriterImplementation {

	public static void main(String[] args) {
		String s = "ismail basha";

		StringReader str = new StringReader(s);
		try {
			for (int i = 0; i < s.length(); i++) {
				char c = (char) str.read();
				System.out.println("" + c);
			}
			str.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		StringWriter stringWriter = new StringWriter();
		stringWriter.write(s);

		System.out.println(" " + stringWriter.toString());
		str.close();
	}

}
