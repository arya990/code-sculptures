package week1.textfileprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//write a program to find a string in a text file of 200mb is palindrome or not

public class StringPalindromeonFIle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\basha\\Desktop\\tasks.txt"));

			String line = null;
			while ((line = br.readLine()) != null) {
				char a1[] = line.toCharArray();
				String s = new StringBuffer(line).reverse().toString();
				char a2[] = s.toCharArray();
				if (Arrays.equals(a1, a2)) {
					System.out.println("palindrome \t" + line);
				} else {
					System.out.println("not palindrome \t" + line);
				}
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("unable to open file ");
		} catch (IOException ex) {
			System.out.println("error reading file ");
		}
	}
}
