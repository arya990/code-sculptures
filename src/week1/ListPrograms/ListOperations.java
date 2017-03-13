package week1.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*for a given set of numbers read them into list and perform following operations
-> find sum of all the numbers
-> reverse the list
-> find head and tail of the list
-> find the middle element of the list
-> divide the list into two equal lists*/

public class ListOperations {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7 }));
		int sum = 0;

		System.out.print("the sum of the list is:");
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}
		System.out.println(sum);

		System.out.println("the reverse of the list is");
		for (int i = list.size() - 1; i >= 0; i--) {
			int rev = 0;
			rev = list.get(i);
			System.out.print(rev + " ");
		}
		System.out.println();

		if (list.size() % 2 == 0) {
			System.out.print("first half: ");
			for (int i = 0; i < list.size() / 2 - 1; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
			System.out
					.println("middle numbers are: " + list.get(list.size() / 2 - 1) + "  " + list.get(list.size() / 2));
			System.out.print("the second half is: ");
			for (int i = list.size() / 2 + 1; i < list.size(); i++) {
				System.out.print(list.get(i) + "  ");
			}
		} else {
			System.out.print("first half is:");
			for (int i = 0; i < list.size() / 2; i++) {
				System.out.print(list.get(i) + "  ");
			}
			System.out.println();
			System.out.println("middle number is: " + list.get(list.size() / 2));
			System.out.print("the second half is: ");
			for (int i = list.size() / 2 + 1; i < list.size(); i++) {
				System.out.print(list.get(i) + "  ");
			}
		}
		System.out.println();
		System.out.println("the head element is :" + list.get(0));
		System.out.println("the tail element is: " + list.get(list.size() - 1));
	}
}
