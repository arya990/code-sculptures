package week3.mar2;

import java.util.Scanner;

//merge sort
public class MergeSort {
	static int temp = 0;
	static int temp1 = 0;

	public static void main(String[] args) {
		System.out.println("Enter the number of elements:");
		Scanner in = new Scanner(System.in);
		int numbers = in.nextInt();
		int a[] = new int[numbers];
		System.out.println("enter the numbers to be sorted:");
		for (int i = 0; i < 4; i++) {
			a[i] = in.nextInt();
		}
		Mergesort(a);
		in.close();
	}

	public static void Mergesort(int a[]) {
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		for (int i = a.length / 2; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				temp1 = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp1;
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				temp = 0;
				temp1 = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
