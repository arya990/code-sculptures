package week3.mar6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
Input Format
The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure: 
ID Name CGPA
Constraints
The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
Output Format
After rearranging the students according to the above rules, print the id, first name of each student on a separate line.
Sample Input
7
33 Manoj 3.75
85 Rishap 3.70
56 Kaushik 3.70
19 Pradeep 3.70
22 Prashanth 3.90
78 Ismail 3.90
37 Manoj 3.75



Sample Output
78 Ismail
22 Prashanth
33 Manoj
37 Manoj
56 Kaushik
19 Pradeep
85 Rishap
Hint: Create a Student class bearing properties id (int), name (String) and cgpa (double). Create a list of Students type and store all the details into the list. Perform sort operations on cgpa property of the Student class in descending order, alphabetical order for name property, ascending order for id property. Use Comparator / Comparable on the student list to sort elements based on the requirement.

*/
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
