package week2.feb20;
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class SmallIntegerDivby1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 500000000;

		for (long i = 10000; i <= number; i++) {
			int c = 0;
			for (int j = 1; j <= 20; j++) {
				long b = i % j;
				if (b == 0) {
					c++;
				}
			}
			if (c == 20) {
				System.out.println("the smallest number divisible by all numbers from 1 to 20 is:" + i);
				break;
			}
		}

	}

}
