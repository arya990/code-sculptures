package week4.mar15;

/*
 * It turns out that 12 cm is the smallest length of wire that can be 
 * bent to form an integer sided right angle triangle in exactly one way,
 * but there are many more examples.

12 cm: (3,4,5)
24 cm: (6,8,10)
30 cm: (5,12,13)
36 cm: (9,12,15)
40 cm: (8,15,17)
48 cm: (12,16,20)

In contrast, some lengths of wire, like 20 cm, 
cannot be bent to form an integer sided right angle triangle, 
and other lengths allow more than one solution to be found; for example, 
using 120 cm it is possible to form exactly three different integer sided right angle triangles.

120 cm: (30,40,50), (20,48,52), (24,45,51)

Given that L is the length of the wire, for how many values of L less than 1,500,000 
can exactly one integer sided right angle triangle be formed?
 */
public class SingularIntegerRightTriangles {

	void run() {
		int L = 1500000;
		int max_m = (int) Math.sqrt(L / 2);
		int[] triple = new int[L + 1];
		int a, b, c;
		int s;
		for (int m = 2; m <= max_m; m++) {
			for (int n = 1; n < m; n++) {
				if (gcd(m, n) == 1 && (m + n) % 2 == 1) {
					a = m * m - n * n;
					b = 2 * m * n;
					c = m * m + n * n;
					s = a + b + c;
					// if(a*a+b*b==c*c){
					while (s <= L) {
						triple[s] += 1;
						s += a + b + c;
					}
					// }
				}
			}
		}
		int count = 0;
		for (int i = 2; i <= L; i++)
			if (triple[i] == 1)
				count++;
		System.out.println(count);

	}

	int gcd(int m, int n) {
		int tmp;
		if (m < n) {
			tmp = m;
			m = n;
			n = tmp;
		}
		while (n != 0) {
			m = m - n;
			if (m < n) {
				tmp = m;
				m = n;
				n = tmp;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		new SingularIntegerRightTriangles().run();
	}
}
