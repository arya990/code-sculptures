package week1.numberoperations;

import java.util.Scanner;
//find a number is armstrong or not

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int sum = 0;
		int temp = 0;
		temp = a;
		while (a > 0) {
			sum = sum + ((a % 10) * (a % 10) * (a % 10));
			a = a / 10;
		}

		if (sum == temp) {
			System.out.println("it is armstrong");
		} else {
			System.out.println("it is not armstrong");
		}
		in.close();
	}

}
