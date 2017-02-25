
package week1.numberoperations;

import java.util.Scanner;
//Write function that translates a text to Pig Latin and back. 
//English is translated to Pig Latin by taking the first letter of every word, 
//moving it to the end of the word and adding ‘ay’.

public class PigLatin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			String a = s1[i];
			char[] b = a.toCharArray();
			char[] c = new char[(b.length) + 2];

			c[c.length - 1] = 'y';
			c[c.length - 2] = 'a';
			c[c.length - 3] = b[0];

			for (int j = 0; j < (c.length) - 3; j++) {
				c[j] = b[j + 1];
			}
			String z = new String(c);
			System.out.print(z + " ");
		}
		in.close();
	}

}
