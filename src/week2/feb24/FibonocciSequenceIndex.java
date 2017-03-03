package week2.feb24;

import java.math.BigInteger;
//What is the index of the first term in the Fibonacci sequence to contain 1000 digits?

public class FibonocciSequenceIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger number1 = BigInteger.ONE;
		BigInteger number2 = BigInteger.ONE;
		// System.out.println(number1+"\n"+number2);
		BigInteger sum = new BigInteger("0");
		int count = 2;
		for (BigInteger i = BigInteger.ZERO; i.compareTo(BigInteger.valueOf((long) Math.pow(2, 1000))) <= 0; i = i
				.add(BigInteger.ONE)) {
			sum = number1.add(number2);
			number1 = number2;
			number2 = sum;
			count++;
			String sum1 = sum.toString();
			if (sum1.length() == 1000) {
				System.out.println(sum1);
				System.out.println(count);
				break;
			}

		}
	}

}
