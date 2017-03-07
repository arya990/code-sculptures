package week3.mar2;

import java.text.SimpleDateFormat;
import java.util.Date;
//Based on the Documentation, explore all the methods of following classes with some examples.
//Date

public class DateImplementation {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toString());

		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(df.format(date));
	}

}
