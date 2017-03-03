package week3.mar2;

import java.util.ArrayList;

public class CircularPrime {

	public static void main(String[] args) {
		//int z=0;
		ArrayList<Long> a = new ArrayList<Long>();
		for (long i = 79; i <= 100; i++) {
			if (!a.contains(i)) {
				long c = 0;
				for (long j = 1; j <= i; j++) {
					if (i % j == 0) {
						c++;      
						
						
					}
				}
				if (c == 1) {
					// System.out.println(i);
					long num = i;
					long rev = 0;
					while (num > 0) {
						
						rev = rev * 10;
						rev = rev + num % 10;
						num = num / 10;
					}
					int d = 0;
					for (long j = 1; j <= Math.sqrt(rev); j++) {
						if (rev % j == 0) {
							d++;
						}
						if (d == 1) {
							a.add(i);
							a.add(rev);

							System.out.println(i + "  " + rev);
						}
					}
				}
			}
		}
		// System.out.println(a.get(0));

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