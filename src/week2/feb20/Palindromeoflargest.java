package week2.feb20;

import java.util.ArrayList;
import java.util.Collections;
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Palindromeoflargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=539,j=538;
		ArrayList<Long> p = new ArrayList<Long>();
		long number = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				number = i * j;
				// System.out.println(number);

				String s = String.valueOf(number);
				String s1 = new StringBuffer(s).reverse().toString();
				if (s1.equals(s)) {
					// System.out.println(number);
					// System.out.println("palindrome number is: ");
					p.add(number);
				}
			}

		}
		System.out.println(p);
		System.out.println("the max prime which is palindrome is: " + Collections.max(p));

	}
}
