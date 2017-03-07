package week3.mar2;

import java.util.Calendar;
//Based on the Documentation, explore all the methods of following classes with some examples.
//Calendar

public class CalenderImplementaion {
	public static void main(String[] args) {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		Calendar calendar = Calendar.getInstance();

		System.out.print("Date: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]);
		System.out.print(" " + calendar.get(Calendar.DATE) + " ");
		System.out.println(calendar.get(Calendar.YEAR));

		System.out.print("Time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));

		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.MINUTE, 29);
		calendar.set(Calendar.SECOND, 22);
		System.out.print("Updated time: ");
		System.out.print(calendar.get(Calendar.HOUR) + ":");
		System.out.print(calendar.get(Calendar.MINUTE) + ":");
		System.out.println(calendar.get(Calendar.SECOND));

		System.out.println(Calendar.AUGUST);
	}
}