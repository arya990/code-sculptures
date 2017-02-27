package week2.feb24;

import java.util.ArrayList;
//Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

public class SumOfNonAbundadntNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem = 0;
		int abundantnumber = 0;
		@SuppressWarnings("unused")
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 12; i < 30; i++) {
			int sum = 0;
			int sum1 = 0;
			for (int j = 1; j < i; j++) {
				rem = i % j;
				if (rem == 0) {
					sum = sum + j;
				}
				}
			
	
		// System.out.println(number);
		abundantnumber = i;
		sum1 = abundantnumber + abundantnumber;
		System.out.println("abundantnumber is:" + abundantnumber);
		System.out.println("sum of number is:" + sum);
		System.out.println("sum of two abundant numbers:" + sum1);

		}
	}

}
