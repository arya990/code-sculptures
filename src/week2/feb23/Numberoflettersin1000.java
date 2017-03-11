package week2.feb23;

/* If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
*/
public class Numberoflettersin1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String base[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String basetens[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String basehundreds[] = { "", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred",
				"sixhundred", "sevenhundred", "eighthundred", "ninehundred", "oneThousand" };
		String number = " ";
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i <= 19) {
				number = base[i];
			} else if (i > 19 && i < 100) {
				int tens = (i / 10);
				int ones = i % 10;
				number = basetens[tens] + base[ones];
			} else {
				int hundreds = i / 100;
				int rem = i % 100;
				if (rem == 0) {
					number = basehundreds[hundreds];
				} else if (rem > 19) {
					int tens = (i / 10) % 10;
					int ones = i % 10;
					number = basehundreds[hundreds] + "and" + basetens[tens] + base[ones];
				} else {
					number = basehundreds[hundreds] + "and" + base[rem];
				}
			}

			sum = sum + number.length();

			 System.out.println(number);

		}
		System.out.println(sum);
	}

}
