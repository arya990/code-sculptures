
package week2.feb22;
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2

public class Pythogreantriplet {

	public static void main(String[] args) {

		int a = 1, b = 1, c = 1;
		long product = 1;
		for (int i = 1; i < 500; i++) {
			a = i;
			for (int j = 1; j < 500; j++) {
				b = j;
				for (int k = 1; k < 500; k++) {
					c = k;
					if (a + b + c == 1000) {
						if ((a * a) + (b * b) == (c * c)) {
							product = a * b * c;
							 System.out.println("the numbers are:"+" "+a+" "+b+" "+c);
							// System.out.println(product);
							break;
						}
					}
				}
			}
		}
		System.out.println(product);
	}

}
