
package week1.numberoperations;

import java.util.Scanner;
//write a program to display a pascal triangle

public class PascalTriangle {

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();

		int a[];
		int b[] = { 1 };
		a = b;
		System.out.println(a[0]);

		for (int i = 2; i <= l; i++) {
			b = new int[i];
			b[0] = 1;
			b[i - 1] = 1;
			for (int j = 0; j <= i - 3; j++) {
				b[j + 1] = a[j] + a[j + 1];
			}
			print(b);
			a = b;
		}
		in.close();
	}
}
