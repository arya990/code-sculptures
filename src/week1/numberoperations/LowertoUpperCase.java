package week1.numberoperations;

import java.util.Scanner;
//convert a lower case to upper case letter.

public class LowertoUpperCase {

	public static void main(String[] args) {
		// char ch='a';
		// if(ch>=97&&ch<=122)
		// {
		// ch=(char)(ch-32);
		// }
		// System.out.println(ch);

		System.out.println("enter the upper case letters:");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				ch = (char) (ch + 32);
			}
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("enter the lower case letters:");
		String s1 = in.nextLine();
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			if (ch1 >= 97 && ch1 <= 122) {
				ch1 = (char) (ch1 - 32);
			}
			System.out.print(ch1);
		}
		in.close();
	}

}
