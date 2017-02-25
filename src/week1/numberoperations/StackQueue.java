package week1.numberoperations;

import java.util.Scanner;
import java.util.Stack;
//write a program to print a stack 

public class StackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		System.out.println(" press any number to enter");
		System.out.println(" 0 to terminate");
		int choice = 0;
		do {
			System.out.println(" 1 for enque");
			System.out.println(" 2 for deque");
			System.out.println(" 3 for printing stack");
			System.out.println("0 to terminate");
			int choice1 = in.nextInt();

			switch (choice1)

			{
			case 1:
				System.out.println("enque");
				int b = in.nextInt();
				s.push(b);
				break;
			case 2:
				System.out.println("deque");
				System.out.println(s.pop());
				break;
			case 3:
				// while(!s.isEmpty())
				// {
				System.out.println(s);
				// }
				break;

			case 0:
				choice = 0;
				break;
			default:
				System.out.println("invalid");
				break;
			}
		} while (choice != 0);

	}
}
