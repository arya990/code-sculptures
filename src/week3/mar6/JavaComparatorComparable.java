package week3.mar6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
	int id;
	String firstName;
	double CGPA;

	Student(int id, String FirstName, double CGPA) {
		this.id = id;
		this.firstName = FirstName;
		this.CGPA = (Math.round(CGPA * 100)) / 100;
	}

	@Override
	public int compareTo(Student st) {
		if (CGPA == st.CGPA) {
			if (firstName == st.firstName) {
				if (id == st.id)
					return 0;
				else if (id > st.id)
					return -1;
				else
					return 1;
			} else if (firstName.compareTo(st.firstName) < 0)
				return -1;
			else
				return 1;
		} else if (CGPA > st.CGPA)
			return -1;
		else
			return 1;

	}
}

public class JavaComparatorComparable {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Enter number of students");
		Scanner in = new Scanner(System.in);
		int numberofentries = in.nextInt();

		for (int i = 0; i < numberofentries; i++) {
			in.nextLine();
			System.out.println("enter student id:");
			int id = in.nextInt();
			in.nextLine();
			System.out.println("enter name:");
			String FirstName = in.nextLine();
			System.out.println("enter cgpa");
			double CGPA = in.nextDouble();

			Student st = new Student(id, FirstName, CGPA);
			list.add(st);
		}

		Collections.sort(list);
		for (Student st : list) {
			System.out.println(st.id + " " + st.firstName);
		}
		in.close();
	}

}
