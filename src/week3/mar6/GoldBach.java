package week3.mar6;

//What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
public class GoldBach {

	public static void main(String[] args) {

		for (int i = 1; i < 6000; i++) {
			if (isComposite(i)) {
				if (isOdd(i)) {
					if (isgoldBach(i) == false) {
						System.out.println(i);
					}
				}
			}
		}
	}

	private static boolean isgoldBach(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 3; j <= n; j++) {
				if (isPrime(j) && j + 2 * i * i == n) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		}
		if (n == 1 || n % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	private static boolean isOdd(int i) {
		if (i % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isComposite(int i) {
		int count = 0;
		for (int j = 1; j < 6000; j++) {
			if (i % j == 0) {
				count++;
				if (count > 2) {
					break;
				}
			}
		}
		if (count > 2) {
			return true;
		} else {
			return false;
		}

	}
}
