package week2.feb23;
//What is the sum of the digits of the number 21000?

import java.math.BigInteger;

public class sumofdigitsof2power1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("2");
		a = a.pow(1000);
		System.out.println(a);
		BigInteger sum = new BigInteger("0");
		BigInteger b = new BigInteger("0");
		while (a.compareTo(BigInteger.ZERO) > 0) {
			b = a.remainder(BigInteger.TEN);
			sum = sum.add(b);
			a = a.divide(BigInteger.TEN);

		}
		System.out.println("The sum of the digits is: " + sum);
	}

}
