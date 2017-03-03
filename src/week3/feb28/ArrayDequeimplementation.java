package week3.feb28;

import java.util.ArrayDeque;

public class ArrayDequeimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque <Integer> a = new ArrayDeque<Integer>();
		a.push(10);
		a.push(13);
		a.push(24);
		System.out.println(a);
		a.pop();
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.peek();
		System.out.println(a);
		System.out.println(a.pollFirst());
	}

}
