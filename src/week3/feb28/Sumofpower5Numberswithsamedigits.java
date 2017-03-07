package week3.feb28;

// Find the sum of all the numbers that can be written as the sum of fifth
// powers of their digits.
public class Sumofpower5Numberswithsamedigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem = 0;

		int totalsum = 0;
		for (int i = 2; i < 1000000; i++) {
			int number = i;
			int sum = 0;
			while (number > 0) {
				rem = number % 10;
				sum = sum + (int) (Math.pow(rem, 5));
				number = number / 10;

			}
			if (sum == i) {
				System.out.println(sum);
				totalsum = totalsum + sum;
			}
		}
		System.out.println(totalsum);
	}

}
