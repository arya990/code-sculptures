package ioprograms;

import java.io.CharArrayReader;

//CharArrayReaderWriterImplementation
public class CharArrayReaderWriterImplementation {

	public static void main(String[] args) {

		char[] ch = { 'H', 'E', 'L', 'L', 'O' };
		CharArrayReader ch1 = null;
		try {
			ch1 = new CharArrayReader(ch);
			int value = 0;
			while ((value = ch1.read()) != -1) {
				char c = (char) value;
				System.out.println(c + " : ");
				System.out.println(value);
			}
			ch1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
