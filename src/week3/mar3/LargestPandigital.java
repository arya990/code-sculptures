package week3.mar3;

public class LargestPandigital {

	public static void main(String[] args) {
			int product =1;
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j < 10; j++) {
				product = i*j;
			}
		}
	}

}
