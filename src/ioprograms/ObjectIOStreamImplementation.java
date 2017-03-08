package ioprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectIOStreamImplementation
public class ObjectIOStreamImplementation {

	public static void main(String[] args) {

		String s = "ismail";
		byte[] b = { 'a', 't', 'd', 'h' };
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\workspace\\textfile\\newfile.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(s);
			objectOutputStream.writeObject(b);

			ObjectInputStream inputStream = new ObjectInputStream(
					new FileInputStream("E:\\workspace\\textfile\\tasks.txt"));
			System.out.println("" + (String) inputStream.readObject());

			byte[] read = (byte[]) inputStream.readObject();
			String s2 = new String(read);
			System.out.println("" + s2);
			inputStream.close();
			objectOutputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
