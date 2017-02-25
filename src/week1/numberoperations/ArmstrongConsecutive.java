package week1.numberoperations;

import java.util.Scanner;
//Find consecutive armstrong numbers

public class ArmstrongConsecutive {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// BigInteger a = in.nextBigInteger();
		//
		// BigInteger n,sum,length = BigInteger.ZERO;
		//
		// for(BigInteger i =
		// BigInteger.ONE;i.compareTo(a)<=0;i.add(BigInteger.ONE))
		// {
		// BigInteger x;
		// n=i;
		// length=String.valueOf(n).length();
		//
		//
		// }

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number");
		long a = in.nextLong();
		long n, y, z;
		long sum, sum1;
		long length = 0;

		for (long i = 1; i <= a; i++) {
			long x;
			n = i;
			sum = 0;
			sum1 = 0;
			length = String.valueOf(n).length();

			while (n > 0) {
				x = n % 10;
				sum = sum + ((int) Math.pow(x, length));
				n = n / 10;

			}

			if (sum == i) {
				// System.out.println("Armstrong Numbers are :" +i);

				y = sum + 1;
				while (y > 0) {
					z = y % 10;
					sum1 = sum1 + ((int) Math.pow(z, length));
					y = y / 10;

				}
				if (sum1 == sum + 1) {
					System.out.println("consecutive armstrong numbers are:" + sum + "   " + sum1);
				}
			}

			in.close();
		}
	}
}
