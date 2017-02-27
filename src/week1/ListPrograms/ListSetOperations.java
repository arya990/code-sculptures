package week1.ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Set operation using Lists
public class ListSetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6 }));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(new Integer[] { 4, 5, 6, 7, 8, 9 }));
		List<Integer> c = new ArrayList<Integer>(10);
		c = a;
		for (int i = 0; i < b.size(); i++) {
			int d = b.get(i);
			if (c.contains(d)) {
				;
			} else {
				c.add(d);
			}
		}
		for(int i=0;i<c.size();i++)
		{
		System.out.print(" "+c.get(i));
		
		}
		//intersection
		if(a.containsAll(b))
		{
		for(int i=0;i<a.size();i++)
		{
			
		}
		}
	}

}
