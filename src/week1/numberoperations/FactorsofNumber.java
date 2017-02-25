package week1.numberoperations;

import java.util.Scanner;
//find all the factors of a given number

public class FactorsofNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b;

		for (int i = 1; i <= a; i++) {
			b = a % i;
			if (b == 0) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
