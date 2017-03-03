package week1.numberoperations;

import java.util.ArrayList;
// find the number which give the same digits when multiplies by 2,3,4,5,6
public class NumberDivBy23456 {

	static boolean digits(long number, long result) {
		ArrayList<Long> a = new ArrayList<Long>();
		ArrayList<Long> b = new ArrayList<Long>();
		String number1 = String.valueOf(number);
		String result1 = String.valueOf(result);
		for (int i = 0; i < number1.length(); i++) {
			long rem = number % 10;
			a.add(rem);
			number = number / 10;
		}
		for (int i = 0; i < result1.length(); i++) {
			long rem = result % 10;
			b.add(rem);
			result = result / 10;
		}
		if (a.containsAll(b)) {
			return true;
		} else {
			a.clear();
			b.clear();
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long finalnumber = 0;
		long result = 0;
		long startTime = System.currentTimeMillis();
		long number = 1;
		while (true) {
//			System.out.println("Computing number:\t" + number);
			result = number * 2;
			if (digits(number, result)) {
				result = number * 3;
				if (digits(number, result)) {
					result = number * 4;
					if (digits(number, result)) {
						result = number * 5;
						if (digits(number, result)) {
							result = number * 6;
							if (digits(number, result)) {
								finalnumber = number;
								System.out.println(
										"Time took for Computation:\t" + (System.currentTimeMillis() - startTime));
//								System.out.println(finalnumber);
								break;
							}
						} else {
							number++;
						}
					} else {
						number++;
					}
				} else {
					number++;
				}
			} else {
				number++;
			}
		}
		System.out.println(finalnumber);
	}

}
