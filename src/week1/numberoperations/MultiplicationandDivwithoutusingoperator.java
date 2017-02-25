
package week1.numberoperations;

import java.util.Scanner;
/* Multiplication and division operations are performed using + and - operators*/

public class MultiplicationandDivwithoutusingoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = in.nextInt();
		System.out.println("enter second number:");
		int b = in.nextInt();
		int product = 0;
		int c = 0;

		for (int i = 0; i < b; i++) {
			product = product + a;
		}
		System.out.println("the product is:" + product);

		if (b != 0) {
			if (a > b) {
				while (a > 0) {
					a = a - b;
					c++;
					if (a < b) {
						System.out.println("remainder is:" + a);
						break;
					}
				}
				System.out.println("the quotient is:" + c);
			} else {
				System.out.println("remainder is:" + a);
				System.out.println("quotient is:" + 0);
			}

		} else {
			System.out.println("arithemetic exception");
		}

	}
}
