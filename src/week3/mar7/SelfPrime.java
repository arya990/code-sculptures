package week3.mar7;

import java.math.BigInteger;

/*The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/
public class SelfPrime {

	public static void main(String[] args) {
		int j = 1;
		BigInteger div = new BigInteger("10000000000");
		;
		BigInteger result = BigInteger.ZERO;
		for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(1000)) <= 0; i = i.add(BigInteger.ONE)) {
			// for (BigInteger i = Bog; i <= 1000; i++) {
			BigInteger x = i.pow(j);
			j++;
			result = result.add(x);
		}
		BigInteger result1 = result.mod(div);
		System.out.println(result1);
	}

}
