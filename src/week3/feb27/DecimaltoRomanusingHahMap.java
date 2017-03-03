package week3.feb27;

import java.util.HashMap;
import java.util.Scanner;

public class DecimaltoRomanusingHahMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> a = new HashMap<Integer, String>();
		Scanner in = new Scanner(System.in);
		Integer number = in.nextInt();
		a.put(1, "I");
		a.put(2, "II");
		a.put(3, "III");
		a.put(4, "IV");
		a.put(5, "V");
		a.put(6, "VI");
		a.put(7, "VII");
		a.put(8, "VIII");
		a.put(9, "IX");
		a.put(10, "X");
		// a.put(11, "XI");
		// a.put(1, "I");
		// a.put(1, "I");
		// a.put(1, "I");
		while (number > 0) {
			number = number % 10;
			System.out.print(a.get(number));
		}
		in.close();
	}

}
