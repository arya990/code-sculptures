package week1.numberoperations;

import java.util.Scanner;
//convert a deciaml number to its equivalent roman number

public class DecimaltoRoman {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the decimal number:");
		int a = in.nextInt();
		int t = 0, o = 0, th = 0, h = 0;
		String thous[] = { " ", "M", "MC", "MCC", "MCCC" };
		String hunds[] = { " ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String tens[] = { " ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String ones[] = { " ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		th = a / 1000;
		h = (a / 100) % 10;
		t = (a / 10) % 10;
		o = a % 10;

		System.out.println("The roman Digit is:  " + thous[th] + hunds[h] + tens[t] + ones[o]);
		in.close();
	}

}
