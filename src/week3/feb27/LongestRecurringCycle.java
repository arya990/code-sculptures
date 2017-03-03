package week3.feb27;
/*A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:
1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
*/

public class LongestRecurringCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Length = 0;
		int num = 0;
//		int count = 0;
//		int max = 0;
		int position=0;

		for (int i = 1000; i >1; i--) {
			 if (Length >= i) {
                 break;
             }
			int r[]=new int [i];
			int value=1;
			
			while(r[value]==0&&value!=0){
				r[value]=position;
				value=value*10;
				value=value%i;
				position++;
			}
//			max=r[value]-position;
			if (position - r[value] >Length) {
                num = i;
                Length = position -r[value];                    
            }
		}
		System.out.println(num+" "+Length);

	}

}
