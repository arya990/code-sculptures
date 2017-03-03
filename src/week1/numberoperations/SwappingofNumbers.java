package week1.numberoperations;

import java.util.Scanner;
//swapping of 2 numbers

public class SwappingofNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = in.nextInt();
		System.out.println("enter second variable:");
		int b = in.nextInt();
		// int temp=0;
		// //using temp varible
		// temp=a;
		// a=b;
		// b=temp;
		// System.out.println("after swapping number1:"+a+"--- number 2:"+b);

		// without using temp variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping number1:" + a + "--- number 2:" + b);

	}

}
