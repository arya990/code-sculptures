package week3.mar2;

import java.util.StringTokenizer;
//Based on the Documentation, explore all the methods of following classes with some examples.
//StringTokenizer

public class StringTokenizerImplementation {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("ismail zia");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st1 = new StringTokenizer("ismail,zia");
		System.out.println(st1.countTokens());
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken(","));
		}

	}

}
