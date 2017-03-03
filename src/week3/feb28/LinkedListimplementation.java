package week3.feb28;

import java.util.*;
public class LinkedListimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		list.add(5);
		list.add(1, 6);
		list.add(10);
		list.add(15);
		System.out.println("list of elements: "+ list);
		
		list.push(6);
		System.out.println(list);
		list.pop();
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
	}

}
