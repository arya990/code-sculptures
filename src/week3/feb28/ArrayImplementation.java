package week3.feb28;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

//By reading a List of Numbers, explore all the methods in following classes
//Array
public class ArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
//		int c[]={4,6,8,3,35,5,7,8,1};
		String array=Arrays.toString(a);
		System.out.println(array);
//		//creating array list from an array
//		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(array));
//		System.out.println(alist);
//		List<int[]> l=Arrays.asList(a);
//		System.out.println(l.get(arg0));
		
		boolean b=Arrays.asList(a).contains(5);
		System.out.println(b);
		
//		int combined[]=Arrays.addAll(a,c);
//		System.out.println(combined);
	}
}
