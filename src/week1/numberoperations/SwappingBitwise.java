package week1.numberoperations;

import java.util.Scanner;
//swap numbers using bitwise operators

public class SwappingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = in.nextInt();
		System.out.println("enter second variable:");
		int b = in.nextInt();

		a = a ^ b;
		b = b ^ a;
		a = b ^ a;
		System.out.println("after swapping number1:" + a + "--- number 2:" + b);
	}
}
