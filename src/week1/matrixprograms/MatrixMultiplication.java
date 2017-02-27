
package week1.matrixprograms;

import java.util.Scanner;
//Perform Matrix Multiplication

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of rows of matrix 1");
		int w = in.nextInt();
		System.out.println("enter number of columns matrix 1");
		int x = in.nextInt();
		System.out.println("enter number of rows for matrix 2");
		int y = in.nextInt();
		System.out.println("enter number of columns for matrix 2");
		int z = in.nextInt();

		int a[][] = new int[w][x];
		int b[][] = new int[y][z];
		int mul[][] = new int[w][z];
		int sum = 0;
		if (x == y) {
			System.out.println("enter 1st matrix");
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < x; j++) {
					a[i][j] = in.nextInt();
				}
			}
			System.out.println("enter 2nd  matrix");
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < z; j++) {
					b[i][j] = in.nextInt();
				}
			}
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < z; j++) {
					for (int k = 0; k < x; k++) {
						sum = sum + a[i][k] * b[k][j];
					}

					mul[i][j] = sum;
					sum = 0;
				}
			}
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < z; j++) {
					System.out.println(mul[i][j]);
				}
			}

		} else {
			System.out.println("not multiplicable");
		}
		in.close();
	}
}
