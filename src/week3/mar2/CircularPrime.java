package week3.mar2;

import java.util.ArrayList;

public class CircularPrime {

	public static void main(String[] args) {
		int z = 0;
		ArrayList<Long> a = new ArrayList<Long>();
		for (long i = 1; i <= 100000; i++) {
			if (!a.contains(i)) {
				long c = 0;
				for (long j = 1; j <= i; j++) {
					if (i % j == 0) {
						c++;
					}
				}
				if (c == 2) {
					// System.out.println(i);
					long num = i;
					long rev = 0;
				 
					while (num > 0) {

						rev = rev * 10;
						rev = rev + num % 10;
						num = num / 10;
					}
					int d = 0;
					for (long j = 1; j <= rev; j++) {
						if (rev % j == 0) {
							d++;
						}
					}
					if (d == 2) {
						a.add(i);
						a.add(rev);

						// System.out.println(i + " " + rev);
						z++;
					}

				}
			}
		}
		// System.out.println(a);
		System.out.println(z);

	}
}

// String s = Long.toString(i);
// String s1 = " ";
// if (!a.contains(s)) {
// for (int k = 0; k < s.length(); k++) {
// s1 = s1 + s.charAt(k);
// }
// if (s.equals(s1)) {
// a.add(s);
// }
// }