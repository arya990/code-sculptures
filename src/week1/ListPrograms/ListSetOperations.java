package week1.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Set operation using Lists
public class ListSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6 }));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 4, 5, 6, 7, 8, 9 }));
		List<Integer> list3 = new ArrayList<Integer>(10);
		list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			int d = list2.get(i);
			if (list3.contains(d)) {
				;
			} else {
				list3.add(d);
			}
		}
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(" " + list3.get(i));

		}
		// intersection
		if (list1.containsAll(list2)) {
			for (int i = 0; i < list1.size(); i++) {

			}
		}
	}

}
