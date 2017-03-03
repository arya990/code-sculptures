package week2.feb21;
//What is the 10001st prime number?

public class Primenumberof100001 {

	public static void main(String[] args) {
		// long number;
		long q = 0;
		int d = 0;
		for (long i = 2; i <= 110000; i++) {
			long c = 0;
			for (long j = 1; j <= 110000; j++) {
				q = i % j;
				if (q == 0) {
					c++;
				}
			}
			if (c == 2) {
				d++;
			}
			if (d == 10001) {
				System.out.println(i);
				break;
			}
		}
	}
}
