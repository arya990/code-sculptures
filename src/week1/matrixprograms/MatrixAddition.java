package week1.matrixprograms;

import java.util.Scanner;
//perform Matrix Addition

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of rows");
		int y = in.nextInt();
		System.out.println("enter number of columns");
		int z = in.nextInt();

		int a[][] = new int[y][z];
		int b[][] = new int[y][z];
		int sum[][] = new int[y][z];

		System.out.println("enter 1st matrix");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				a[i][j] = in.nextInt();
			}
		}
		System.out.println("enter 2nd matrix");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				b[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("the sum of 2 matrices is:");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < z; j++) {
				System.out.println(sum[i][j]);
			}
		}
		in.close();
	}
}
