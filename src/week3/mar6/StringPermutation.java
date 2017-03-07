package week3.mar6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StringPermutation {
		public static void permute(String input, int left, int right) {
			if (left == right)
				System.out.println(input);
			else
				for (int i = left; i <= right; i++) {
					input = swap(input, left, i);
					permute(input, left + 1, right);
					input = swap(input, left, i);
				}
		}

		public static String swap(String swapStr, int x, int y) {
			char[] charArr = swapStr.toCharArray();
			char temp = charArr[x];
			charArr[x] = charArr[y];
			charArr[y] = temp;

			return String.valueOf(charArr);
		}

		public static void main(String[] args) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string to permute:\n");
			String input;
			try {
				input = br.readLine();
				permute(input, 0, input.length() - 1);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

}


