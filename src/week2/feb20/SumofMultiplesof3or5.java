package week2.feb20;

import java.util.Scanner;

//Find the sum of all the multiples of 3 or 5 below 1000.
public class SumofMultiplesof3or5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n = in.nextInt();
		int Array1[] = new int[n + 1];
		int Array2[] = new int[n + 1];
		for (int i = 0; i < n - 1; i++) {
			Array1[i] = i + 1;
			if (Array1[i] % 3 == 0 || Array1[i] % 5 == 0) {
				Array2[i] = Array1[i];
				System.out.println(Array2[i]);
				sum = sum + Array2[i];

			}
		}
		System.out.println("The sum of the multiple of 3 or 5 is: " + sum);
	}

}
