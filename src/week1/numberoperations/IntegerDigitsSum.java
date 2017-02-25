package week1.numberoperations;

import java.util.Scanner;
//sum of digits of a given integer

public class IntegerDigitsSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		// int a = 444;
		int sum = 0;
		// TODO Auto-generated method stub
		while (a > 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
		System.out.println(sum);

		// if(sum<9)
		// {
		// System.out.println(sum);
		// }
		// else
		// { int sum1=0;
		// while(sum>0)
		// {sum1 = sum1 + sum%10;
		// sum=sum/10;
		// }
		// System.out.println(sum1);
		// }
		in.close();
	}
}
