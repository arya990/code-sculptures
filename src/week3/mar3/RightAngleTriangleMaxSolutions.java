package week3.mar3;

/*If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.

{20,48,52}, {24,45,51}, {30,40,50}

For which value of p <= 1000, is the number of solutions maximised?
*/
public class RightAngleTriangleMaxSolutions {

	public static void main(String[] args) {

		int maxPerimeter = 0;
		int maxTriangle = 0;
		for (int p = 1; p <= 1000; p++) {
			int triangles = count(p);
			if (triangles > maxTriangle) {
				maxTriangle = triangles;
				maxPerimeter = p;
			}
		}
		System.out.println(maxPerimeter);

	}

	private static int count(int p) {
		int count = 0;
		for (int i = 1; i <= p; i++) {
			for (int j = i; j <= p; j++) {
				int c = p - i - j;
				if (j <= c && i * i + j * j == c * c) {
					count++;
				}
			}
		}
		return count;
	}
}
