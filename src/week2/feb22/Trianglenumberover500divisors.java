package week2.feb22;
//What is the value of the first triangle number to have over five hundred divisors?

public class Trianglenumberover500divisors {

	public static void main(String[] args) {
		long b = 0, number = 0, sum = 0;
		for (long i = 1; i <= 1000000; i++) {
			sum = sum + i;
			int c = 0;
			for (long j = 1; j <= Math.sqrt(sum); j++) {
				b = sum % j;
				if (b == 0) {
					c++;
				}
			}
			c = c * 2;
			if (c > 500) {
				number = sum;
				System.out.println(c);

				break;

			}
		}
		System.out.println(number);
	}

}
