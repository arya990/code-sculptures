package week3.feb28;

import java.util.Scanner;
//Write code for Binary Search on a list of numbers

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = in.nextInt();
		int a[] = new int[n];
		int low = 0;
		int high = n - 1;
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			a[i] = number;
		}
		System.out.println("enter element to be found");
		int key = in.nextInt();

		while (high > low) {
			int middle = (low + high) / 2;
			if (a[middle] == key) {
				System.out.println("number found:" + key);
				break;
			} else if (a[middle] < key) {
				low = middle + 1;
			} else if (a[middle] > key) {
				high = middle - 1;
			} else {
			}
		}
		System.out.println("element not found");

		in.close();
	}

}
