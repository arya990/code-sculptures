package week1.numberoperations;

import java.math.BigInteger;
import java.util.Scanner;
//write a program to find a number is prime or not

public class Primeornot {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = BigInteger.valueOf(0);
		BigInteger c = BigInteger.valueOf(0);

		// b=a.remainder(BigInteger.valueOf(2));
		// System.out.println(b);

		for (BigInteger i = BigInteger.ONE; i.compareTo(a) <= 0; i = i.add(BigInteger.ONE)) {
			b = a.remainder(i);
			if (b.equals(BigInteger.ZERO)) {
				c = c.add(BigInteger.ONE);
			}
		}
		if (c.equals(BigInteger.valueOf(2))) {
			System.out.println("its prime");
		} else {
			System.out.println("not prime");
		}
	}
}
