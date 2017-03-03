package week2.feb20;

import java.util.ArrayList;
import java.util.Collections;
//What is the largest prime factor of the number 600851475143 ?

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the number is: ");
		long a = 600851475143L;
		System.out.println(a);
		ArrayList<Long> l = new ArrayList<Long>();
		for (long i = 1; i <= a; i++) {
			int d = 0;
			long b = a % i;
			if (b == 0) {
				for (long j = 1; j <= i; j++) {
					long c = i % j;
					if (c == 0) {
						d++;
					}
				}
				if (d == 2) {
					l.add(i);
					System.out.println(l);
					System.out.println("the max prime is: " + Collections.max(l));
				}

			}

		}

	}

}
