package week3.mar6;

/*The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
*/
public class ConsecutivePrimeSUm {

	public static void main(String[] args) {
		int sum = 0;
		int number = 2;

		while ((sum + number) < 1000000) {
			if (Prime(number)) {
				sum = sum + number;
				if (Prime(sum)) {
					System.out.println(sum);
				}
			}
			number++;

		}

		System.out.println(sum);
	}

	private static boolean Prime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0 && number != i) {
				return false;
			}
		}
		return true;
	}

}
