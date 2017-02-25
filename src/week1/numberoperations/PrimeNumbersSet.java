
package week1.numberoperations;

import java.util.Scanner;

public class PrimeNumbersSet {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		long i, j;
		int d = 0;
		for (i = 2; i <= a; i++) {
			long c = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(i);
				d++;
			}

		}
		System.out.println("total number of primes:" + d);
	}
}
