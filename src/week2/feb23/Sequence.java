package week2.feb23;

/* The following iterative sequence is defined for the set of positive integers:
  Which starting number, under one million, produces the longest chain?
*/
public class Sequence {

	public static void main(String[] args) {

		long a = 1000000L;
		long number = 0, d = 0;
		long number1 = 0;
		for (long i = a; i > 1; i--) {
			number = i;
			int c = 1;
			while (number != 1) {
				if (number % 2 == 1) {
					number = 3 * number + 1;
				} else {
					number = number / 2;
				}
				c++;
			}
			if (c > d) {
				number1 = i;
				d = c;
			}
		}
		System.out.println("the number is:" + number1 + "\n" + "the count is:" + d);
	}

}
