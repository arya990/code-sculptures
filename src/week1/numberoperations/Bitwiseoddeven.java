package week1.numberoperations;

import java.util.Scanner;
//Bitwise odd and even

public class Bitwiseoddeven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		if ((a & 1) == 0) {
			System.out.println("even");
		}
		if ((a & 1) == 1) {
			System.out.println("odd");
		}
		in.close();
	}
}
