package week2.feb23;
//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int day = 1;
		// String a[] = new String[] { " ", "january", "february", "march",
		// "april", "may", "june", "july", "august",
		// "september", "october", "november", "december" };
		for (int i = 1901; i <= 2000; i++) {
			for (int j = 1; j <= 12; j++) {
				
				switch (j) {
				
				case 1:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 2:
					if ((i / 4 == 0) || (i / 400 == 0)) {
						day = day + 1;
					} else {
						day = day + 0;
					}
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 3:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 4:
					day = day + 2;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 5:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 6:
					day = day + 2;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 7:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 8:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 9:
					day = day + 2;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 10:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 11:
					day = day + 2;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				case 12:
					day = day + 3;
					if (day > 5) {
						if (day % 6 == 0) {
							count++;
						}
						day = day % 7;
					}
					break;
				}
			}
		}
		System.out.println(count);
	}

}
