package week1.numberoperations;

import java.util.Scanner;
//convert a plain text into a morse code

public class MorseCode {

	public static void main(String[] args) {

		String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };

		// String plainText [] = {"A","B","C","D","E","F","G","H","I","J",
		// "K","L","M","N","O","P","Q","R","S","T",
		// "U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
		//
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			switch (ch) {
			case 'A':
			case 'a':
				System.out.print(morse[0]);
				break;
			case 'B':
			case 'b':
				System.out.print(morse[1]);
				break;
			case 'C':
			case 'c':
				System.out.print(morse[2]);
				break;
			case 'D':
			case 'd':
				System.out.print(morse[3]);
				break;
			case 'E':
			case 'e':
				System.out.print(morse[4]);
				break;
			case 'F':
			case 'f':
				System.out.print(morse[5]);
				break;
			case 'G':
			case 'g':
				System.out.print(morse[6]);
				break;
			case 'H':
			case 'h':
				System.out.print(morse[7]);
				break;
			case 'I':
			case 'i':
				System.out.print(morse[8]);
				break;
			case 'J':
			case 'j':
				System.out.print(morse[9]);
				break;
			case 'K':
			case 'k':
				System.out.print(morse[10]);
				break;
			case 'L':
			case 'l':
				System.out.print(morse[11]);
				break;
			case 'M':
			case 'm':
				System.out.print(morse[12]);
				break;
			case 'N':
			case 'n':
				System.out.print(morse[13]);
				break;
			case 'O':
			case 'o':
				System.out.print(morse[14]);
				break;
			case 'P':
			case 'p':
				System.out.print(morse[15]);
				break;
			case 'Q':
			case 'q':
				System.out.print(morse[16]);
				break;
			case 'R':
			case 'r':
				System.out.print(morse[17]);
				break;
			case 'S':
			case 's':
				System.out.print(morse[18]);
				break;
			case 'T':
			case 't':
				System.out.print(morse[19]);
				break;
			case 'U':
			case 'u':
				System.out.print(morse[20]);
				break;
			case 'V':
			case 'v':
				System.out.print(morse[21]);
				break;
			case 'W':
			case 'w':
				System.out.print(morse[22]);
				break;
			case 'X':
			case 'x':
				System.out.print(morse[23]);
				break;
			case 'Y':
			case 'y':
				System.out.print(morse[24]);
				break;
			case 'Z':
			case 'z':
				System.out.print(morse[25]);
				break;
			case '0':
				System.out.print(morse[26]);
				break;
			case '1':
				System.out.print(morse[27]);
				break;
			case '2':
				System.out.print(morse[28]);
				break;
			case '3':
				System.out.print(morse[29]);
				break;
			case '4':
				System.out.print(morse[30]);
				break;
			case '5':
				System.out.print(morse[31]);
				break;
			case '6':
				System.out.print(morse[32]);
				break;
			case '7':
				System.out.print(morse[33]);
				break;
			case '8':
				System.out.print(morse[34]);
				break;
			case '9':
				System.out.print(morse[35]);
				break;

			}

		}

	}

}
