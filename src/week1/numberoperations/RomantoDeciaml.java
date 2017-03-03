package week1.numberoperations;

import java.util.Scanner;
//write a program to convert a roman number to a decimal number S

public class RomantoDeciaml {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.toUpperCase();
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);

			switch (a) {
			case 'M':
				num = num + 1000;
				break;
			case 'D':
				num = num + 500;
				break;
			case 'C':
				num = num + 100;
				break;
			case 'L':
				num = num + 50;
				break;
			case 'X':
				num = num + 10;
				break;
			case 'I':
				num = num + 1;
				break;

			}
		}

		System.out.println(num);
	}
}