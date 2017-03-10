package week3.mar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapInterface {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter number of entries:");
		int numberofentries = in.nextInt();
		
		for (int i = 0; i < numberofentries; i++) {
			in.nextLine();
			System.out.println("enter contact name:");
			String name=in.nextLine();
			System.out.println("enter contact number:");
			int number=in.nextInt();
			map.put(name,number);
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
