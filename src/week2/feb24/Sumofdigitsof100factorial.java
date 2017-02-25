package week2.feb24;
//Find the sum of the digits in the number 100!

import java.math.BigInteger;

public class Sumofdigitsof100factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger number = new BigInteger("100");
		BigInteger product = new BigInteger("1");
		BigInteger a = new BigInteger("0");
		BigInteger sum = new BigInteger("0");
		for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
			product = product.multiply(i);
		}
		System.out.println(product);
		while (product.compareTo(BigInteger.ZERO) > 0) {
			a = product.remainder(BigInteger.valueOf(10));
			sum = sum.add(a);
			product = product.divide(BigInteger.valueOf(10));
		}
		System.out.println("the sum is:" + sum);
	}

}
