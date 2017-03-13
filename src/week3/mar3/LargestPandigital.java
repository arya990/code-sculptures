package week3.mar3;

import java.util.ArrayList;

//Largest Pandigital number when concatinated by product of a number
public class LargestPandigital {
	public static ArrayList<Integer> numbers = new ArrayList<Integer>();
	static String s1 = "";
	static String s2 = "";

	public static void getNumberofDigits(int x) {
		int z = x;
		String s = Integer.toString(x);
		while (x > 0) {
			int rem = x % 10;
			x = x / 10;
			if (!numbers.contains(rem)) {
				numbers.add(rem);
				if (numbers.size() == 9) {
					System.out.println(s1);

					break;
				}
				s1 = Integer.toString(z);
			}

		}
		s1 = s1 + s;
	}

	public static void main(String[] args) {

		for (int i = 9327; i <= 10000; i++) {
			// String str = " ";
			int product = 1;
			for (int j = 1; j < 10; j++) {
				product = i * j;
				// str = Integer.toString(product);
				getNumberofDigits(product);

			}
		}
	}

}
