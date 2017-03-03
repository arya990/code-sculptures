package week3.feb28;
import java.util.*;
public class ArrayListimplementations {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<>();
		a.add(8);
		a.add(5);
		a.add(7);
		System.out.println("elements are:"+a);
		a.add(2, 10);
		System.out.println("element added at index 2 is:"+a);
		a.clone();
		System.out.println(a.contains(5));
		System.out.println("the numberouput is:"+a.get(2));
		System.out.println(a.isEmpty());
		System.out.println("index of:"+a.indexOf(5));
		System.out.println(a.lastIndexOf(7));
		System.out.println(a.remove(0));
//		System.out.println(subList( 0,1));
		System.out.println(a.toArray());
	}

}
