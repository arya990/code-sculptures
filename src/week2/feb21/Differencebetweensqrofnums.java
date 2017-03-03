package week2.feb21;
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Differencebetweensqrofnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int result1 = 0;
		int result2 = 0;
		for (int i = 1; i <= 100; i++) {
			number = i;
			result1 = result1 + number * number;
			result2 = result2 + i;
		}
		System.out.println("the sum of squares of the number is: " + result1);
		result2 = result2 * result2;
		System.out.println("the square of the number is: " + result2);
		System.out.println("the difference between the 2 results is: " + (result2 - result1));

	}

}
