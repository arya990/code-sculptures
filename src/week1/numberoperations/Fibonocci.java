package week1.numberoperations;

import java.util.Scanner;
//find the fibonocci series

public class Fibonocci {
	static int a1 = 0, a2 = 1, sum = 0;
	static Scanner in = new Scanner(System.in);
	static int a = in.nextInt();

	// Recursion method
	public void fibonocciMethod(int a) {
		for (int i = 2; i <= a; i++) {
			sum = a1 + a2;
			System.out.print(" " + sum);
			a1 = a2;
			a2 = sum;
		}

	}

	public static void main(String[] args) {

		// USING ITERATIVE
		// Scanner in = new Scanner(System.in);
		// int a= in.nextInt();
		// int a1=0,a2=1;
		// int sum=0;
		// System.out.print(a1+" "+a2);
		// for (int i=1;i<a;i++)
		// {
		// sum=a1+a2;
		// System.out.print(" "+sum);
		// a1=a2;
		// a2=sum;
		// }

		System.out.print(a1 + " " + a2);
		new Fibonocci().fibonocciMethod(a);
		in.close();
	}
}
