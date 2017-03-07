package week3.feb28;

import java.util.Scanner;
/*Write code for Following Sorting Algorithms
Insertion Sort
Selection Sort
Bubble Sort
*/
public class Sorting {

	public static void insertionSort(int a[])

	{
		for (int i = 1; i < a.length; i++) {
			int j = i;
			int temp = a[i];
			while (j > 0 && temp < a[j - 1]) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		System.out.println("insertion sort is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "  ");
		}
		System.out.println();

	}

	public static void selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[index] > a[j]) {
					index=j;
				}
					
				}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
		System.out.println("Selection sort is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "  ");
		}
		System.out.println();

	}
	public static void bubbleSort(int a[])
	{
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=0; j<(a.length)-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("bubblesort sort is:");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			a[i] = number;
		}
		insertionSort(a);
		selectionSort(a);
		bubbleSort(a);
		in.close();
	}

}
