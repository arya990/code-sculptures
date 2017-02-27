package week1.numberoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//sum of the digits in the mersens prime
public class MersensPrimeaddition {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\basha\\Desktop\\M74207281.txt";
		String line = null;
		long sum=0;
		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				
				sum=Integer.parseInt(line);
			}
//			System.out.println(sum);
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("error reading file '" + fileName + "'");
		}
	}

}
