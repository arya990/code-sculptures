package ioprograms;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//PipedIOStreamImplememtation 
public class PipedIOStreamImplememtation {

	public static void main(String[] args) {

		PipedInputStream inputStream = new PipedInputStream();
		PipedOutputStream outputStream = new PipedOutputStream();

		try {
			inputStream.connect(outputStream);
			outputStream.write(70);
			outputStream.write(71);
			for (int i = 0; i < 2; i++) {
				System.out.println(" " + (char) inputStream.read());
			}
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
