package week3.mar10;

import java.math.BigInteger;

/* A googol (10100) is a massive number: one followed by one-hundred zeros; 
 * 100100 is almost unimaginably large: one followed by two-hundred zeros. 
 * Despite their size, the sum of the digits in each number is only 1.
 * Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
*/
public class PowerfulDigit {
	public void run() {
		int max = 0;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger pow = BigInteger.valueOf(a).pow(b);
				max = Math.max(digitSum(pow), max);
			}
		}
		System.out.println(Integer.toString(max));
	}

	private static int digitSum(BigInteger n) {
		int sum = 0;
		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		return sum;
	}

	public static void main(String[] args) {

		PowerfulDigit p = new PowerfulDigit();
		p.run();
	}
}
