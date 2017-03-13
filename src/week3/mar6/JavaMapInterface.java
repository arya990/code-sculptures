package week3.mar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Input Format
The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number. 
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
Output Format
For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.


Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry


Sample Output
uncle sam=99912222
Not found
harry=12299933
*/
public class JavaMapInterface {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of entries:");
		int numberofentries = in.nextInt();

		for (int i = 0; i < numberofentries; i++) {
			in.nextLine();
			System.out.println("enter contact name:");
			String name = in.nextLine();
			System.out.println("enter contact number:");
			int number = in.nextInt();
			map.put(name, number);
		}
		System.out.println("enter name to be found:");
		in.nextLine();
		while (in.hasNext()) {

			String inputName = in.nextLine();

			if (map.containsKey(inputName)) {
				System.out.println(inputName + "=" + map.get(inputName));
			} else {
				System.out.println("Not Found");
			}

		}
		in.close();
	}

}
