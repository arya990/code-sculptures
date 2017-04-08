package week4.mar15;

import java.util.ArrayList;
import java.util.List;
/*
 * The number 145 is well known for the property that 
 * the sum of the factorial of its digits is equal to 145:

1! + 4! + 5! = 1 + 24 + 120 = 145

Perhaps less well known is 169, 
in that it produces the longest chain of numbers that link back to 169; it turns out that there are only three such loops that exist:
169-363601-1454-169
871-45361-871
872-45362-872

It is not difficult to prove that EVERY starting number 
will eventually get stuck in a loop. For example,


Starting with 69 produces a chain of five non-repeating terms, 
but the longest non-repeating chain with a starting number below one million is sixty terms.

How many chains, with a starting number below one million, contain exactly sixty non-repeating terms?
 */

public class DigitFactorialChains {
	static int[] f = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

	public static void main(String[] args) {
		int limit = 1000000;
		int result = 0;

		for (int i = 1; i <= limit; i++) {
			int n = i;
			List<Integer> seq = new ArrayList<Integer>();

			while (!seq.contains(n)) {
				seq.add(n);
				n = FacSum(n);
			}

			if (seq.size() == 60)
				result++;
		}
		System.out.println(result);
	}

	public static int FacSum(int n) {
		int temp = n;
		int facsum = 0;

		while (temp > 0) {
			facsum += f[temp % 10];
			temp /= 10;
		}
		return facsum;
	}

}
