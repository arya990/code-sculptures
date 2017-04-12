package ioprograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferIOStreamImplementation
public class BufferIOStreamImplementation {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws FileNotFoundException, IOException {

		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("E:\\workspace\\textfile\\tasks.txt"));
			DataInputStream dis = new DataInputStream(bis);
			try {
				while (dis.available() != 0) {
					System.out.println(dis.readLine());
				}
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		try {
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("E:\\workspace\\textfile\\output.txt"));
			bos.write("ismail basha".getBytes());
			bos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
