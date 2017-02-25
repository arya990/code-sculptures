
package week2.feb24;
/*Evaluate the sum of all the amicable numbers under 10000.*/

public class AmicableNumbers {

	public static void main(String[] args) {
		

		int number = 10000;
		int number1 = 0, number2 = 0;
		int totalsum = 0;
		for (int i = 1; i <= number; i++) {
			number1 = i;
			int rem = 0;
			int fact1 = 0, fact2 = 0;
			int sum1 = 0, sum2 = 0;
			for (int j = 1; j < number1; j++) {
				rem = number1 % j;
				if (rem == 0) {
					fact1 = j;
					// System.out.println(fact1);
					sum1 = sum1 + fact1;
				}
			}
			if(sum1!=number1)
			{
			number2 = sum1;
			for (int j = 1; j < number2; j++) {
				rem = number2 % j;
				if (rem == 0) {
					fact2 = j;
					// System.out.println(fact2);
					sum2 = sum2 + fact2;
				}
			}
			// System.out.println(sum1);
			// System.out.println(sum2);
			
			if (number1 == sum2) {
				System.out.println(sum1 + "--" + sum2);
				totalsum = totalsum + (sum1 + sum2);

			}
			}
		}
		System.out.println("total sum is:" + totalsum);
	}

}
