package week3.feb28;

import java.util.ArrayList;

/*The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.
If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
*/
public class LowestCommonDivisorofDenominatior {
	static int product = 1;

	public static void main(String[] args) {

		for (double i = 11; i < 99; i++) {
			for (double j = 12; j < 100; j++) {
				if ((i < j) && (i % 10 != 0) && (j % 10 != 0)) {
					calulate(i, j);
				}
			}
		}
		System.out.println(product);

	}

	public static void calulate(double i, double j) {
		double result1;
		double result2;
		// int a=i;
		// int b=j;
		// result1=a/b;
		result1 = i / j;
		int num2 = (int) i % 10;
		int num1 = (int) i / 10;
		int num4 = (int) j % 10;
		int num3 = (int) j / 10;
		if (num1 == num3) {
			result2 = (double) num2 / num4;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
				commonFactors(i, j);
			}
		}
		if (num2 == num4) {
			result2 = (double) num1 / num3;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
				commonFactors(i, j);
			}
		}
		if (num1 == num4) {
			result2 = (double) num2 / num3;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
				commonFactors(i, j);
			}
		}
		if (num2 == num3) {
			result2 = (double) num1 / num4;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
				commonFactors(i, j);
			}
		}

	}

	public static void commonFactors(double i, double j) {
		ArrayList<Integer> check = new ArrayList<Integer>();
		int denominator = (int) j;
		for (int k = 1; k < denominator; k++) {
			int rem = denominator / k;
			if (rem == 0) {
				if (check.contains(k)) {
					product = product * k;
				} else {
					check.add(k);
				}
			}
		}

	}
}