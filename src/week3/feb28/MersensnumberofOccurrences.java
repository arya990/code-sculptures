package week3.feb28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*In largest mersenne prime number find number of occurrences of 
0’s 1’s 2’s 3’s 4’s 5’s 6’s 7’s 8’s 9’s
*/
public class MersensnumberofOccurrences {
	static int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0,
			count9 = 0, count0 = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "C:\\Users\\basha\\Desktop\\M74207281.txt";
		FileReader fileReader = new FileReader(fileName);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {

			sumDigits(line);

		}
		System.out.println("0's:" + count0 + " 1's:" + count1 + " 2's:" + count2 + " 3's:" + count3 + " 4's:" + count4
				+ " 5's:" + count5 + " 6's:" + count6 + " 7's:" + count7 + " 8's:" + count8 + " 9's:" + count9);

	}

	public static void sumDigits(String str) {

		StringBuilder strAppend = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				strAppend.append(str.charAt(i));
			}
		}

		String strDigits = strAppend.toString();

		for (int i = 0; i < strDigits.length(); i++) {
			int number = Integer.parseInt(strDigits.substring(i, i + 1));
			if (number == 0) {
				count0++;
			} else if (number == 1) {
				count1++;
			} else if (number == 2) {
				count2++;
			} else if (number == 3) {
				count3++;
			} else if (number == 4) {
				count4++;
			} else if (number == 5) {
				count5++;
			} else if (number == 6) {
				count6++;
			} else if (number == 7) {
				count7++;
			} else if (number == 8) {
				count8++;
			} else if (number == 9) {
				count9++;
			}
		}

	}

}
