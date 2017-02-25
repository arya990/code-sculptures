package week1.numberoperations;

import java.util.Scanner;
//write a program to check a String is palindrome or not 

public class StringPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String rev = "";
		System.out.println(s);
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if (rev.equals(s)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
