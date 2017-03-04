package week3.feb28;

public class LowestCommonDivisorofDenominatior {

	public static void main(String[] args) {

		for (int i = 11; i < 99; i++) {
			for (int j = 12; j < 100; j++) {
				if ((i < j) && (i % 10 != 0) && (j % 10 != 0)) {
					calulate(i, j);
				}
			}
		}

	}

	public static void calulate(int i, int j) {
		float result1;
		float result2;
		// int a=i;
		// int b=j;
		// result1=a/b;
		result1 = i / j;
		int num2 = i % 10;
		int num1 = i / 10;
		int num4 = j % 10;
		int num3 = j / 10;
		if (num1 == num3) {
			result2 = num2 / num4;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
			}
		}
		if (num2 == num4) {
			result2 = num1 / num3;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
			}
		}
		if (num1 == num4) {
			result2 = num2 / num3;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
			}
		}
		if (num2 == num3) {
			result2 = num1 / num4;
			if (result1 == result2) {
				System.out.println(i + "  " + j);
			}
		}
	}

}
