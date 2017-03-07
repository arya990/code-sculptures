package week3.mar3;
/*If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p <= 1000, is the number of solutions maximised?
*/
public class RightAngleTriangleMaxSolutions {

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
//							 System.out.println(product);
							break;
						}
					}
				}
			}
	}

	}
}
