
package week1.numberoperations;

import java.util.Scanner;
//find the factorial of a number

public class FactorialofNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int n = 1;
		for (int i = 1; i <= a; i++) {
			n = n * i;
		}
		System.out.println(n);
		in.close();
	}

}
