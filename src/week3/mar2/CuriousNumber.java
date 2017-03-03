package week3.mar2;

public class CuriousNumber {
	int rem = 0;

	public int factorial(int x) {
		if (x == 0) {
			return 1;
		}
		int y = x;
		for (int i = 1; i < x; i++) {
			y = y * i;
		}
		return y;
	}

	public void sum() {
		int a[] = new int[10];
		int result = 0;
		for (int i = 0; i < 10; i++) {
			a[i] = factorial(i);
		}
		for (int i = 10; i < 1000000; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				rem = num % 10;
				sum = sum + a[rem];
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(sum);
				result = result + sum;
			}
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		CuriousNumber c = new CuriousNumber();
		c.sum();
	}

}

// public void sum() {
// int a[] = new int[10];
// BigInteger result = new BigInteger("0");
// for (int i = 0; i < 10; i++) {
// a[i] = factorial(i);
// }
// for (int i = 10; i < 1000000; i++) {
// BigInteger sum = new BigInteger("0");
// BigInteger num = new BigInteger("i");
// ;
// while (num.compareTo(BigInteger.ZERO) > 0) {
// rem = num.remainder(BigInteger.valueOf(10));
// sum = sum.add(BigInteger.valueOf(a[rem]));
// num = num.divide(BigInteger.TEN);
// }
// if (sum == i) {
// System.out.println(sum);
// result = result + sum;
// }
// }
//
// }
