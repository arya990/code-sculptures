package week1.numberoperations;

import java.util.Scanner;
import java.util.Stack;
//count number of ones in a binary number

public class CountNumberof1 {

	public static void main(String[] args) {
		System.out.println("Please Enter a Value");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		int b, c = 0;
		// System.out.println(Integer.toBinaryString(a));
		while (a > 0) {
			b = a % 2;
			s.push(b);
			a = a / 2;
		}

		while (!(s.isEmpty())) {
			b = s.pop();
			if (b == 1) {
				c++;
			}

			System.out.print(b);

		}
		System.out.println("\n" + c);
		in.close();
	}

}
