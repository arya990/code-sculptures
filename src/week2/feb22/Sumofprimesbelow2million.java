package week2.feb22;
//Find the sum of all the primes below two million.

public class Sumofprimesbelow2million {

	public static void main(String[] args) {
		long a = 2000000L;
		long sum = 0;
		for (long i = 2; i <= a; i++) {
			int c = 0;
			for (long j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// int sum =2+3+5+7+11+13+17+19,b=0;
		// for (int i=3;i<=a;i++)
		// { int c=0;
		// if(((i%2)!=0)&&((i%3)!=0)&&((i%5)!=0)&&((i%7)!=0)&&((i%11)!=0)&&((i%13)!=0)&&((i%17)!=0)&&((i%19)!=0))
		// for(int j=2;j<=i;j++)
		// {
		// b=i%j;
		// if(b==0)
		// {
		// c++;
		// }
		// }
		// if(c==1)
		// {
		// sum = sum + i;
		// }
		//
		// }
		// System.out.println(sum);
	}
}
