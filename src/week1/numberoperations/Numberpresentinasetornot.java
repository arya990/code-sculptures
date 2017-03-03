
package week1.numberoperations;

import java.util.Scanner;
//Write a program to find if a given number is present in a set of numbers

public class Numberpresentinasetornot {
	public static void main(String[] args) {
		int a[], i;
		System.out.println("enter the length of set");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		a = new int[n];
		System.out.println("enter the numbers");
		for (i = 0; i < a.length; i++)
			a[i] = in.nextInt();

		System.out.println("enter number to be found:");
		int c = in.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] == c) {
				System.out.println("number found");
			}
		}
		if (i == n) {
			System.out.println("number not found");
		}
		in.close();
	}
}
