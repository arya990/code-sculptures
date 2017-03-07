package week3.mar2;

import java.util.Random;
//Based on the Documentation, explore all the methods of following classes with some examples.
//Random

public class RandomImplementation {

	public static void main(String[] args) {

		int num = 10;
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			int randomInt = random.nextInt(50);
			System.out.println(randomInt);
		}
	}

}
