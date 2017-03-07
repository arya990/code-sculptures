package week3.mar2;

/*The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
*/
public class DecimalandBinaryPalindrome {

	public static void main(String[] args) {
		int i, totalsum = 0;
		for (i = 1; i <= 1000000; i++) {
			String number1 = Integer.toString(i);
			String number2 = new StringBuffer(number1).reverse().toString();

			if (number1.equals(number2)) {
				StringBuffer br = new StringBuffer();
				int temp = 0;
				temp = i;
				while (temp >= 1) {
					if (temp % 2 != 0) {
						br.append(1);
					} else if (temp % 2 == 0) {
						br.append(0);
					}
					temp = (temp / 2);
				}
				String binary1 = br.toString();

				String binary2 = new StringBuffer(binary1).reverse().toString();

				if (binary1.equals(binary2))

				{
					totalsum += i;
				}

			}

		}
		System.out.println("total sum: " + totalsum);
	}

}
