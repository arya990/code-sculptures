package week4.mar15;

/*
 * It is possible to write five as a sum in exactly six different ways:

4 + 1
3 + 2
3 + 1 + 1
2 + 2 + 1
2 + 1 + 1 + 1
1 + 1 + 1 + 1 + 1

How many different ways can one hundred be written as a sum of at least two positive integers?
 */
public class CountingSummations {

	public static void main(String[] args) {
		int sum = 100;
		int[] array = new int[sum + 1];
		array[0] = 1;

		for (int i = 1; i <= 99; i++) {
			for (int j = i; j <= sum; j++) {
				array[j] += array[j - i];
			}
		}
		System.out.println(array[array.length - 1]);
	}

}
