package week4.mar17;
//finding pi value using montey carlo 
public class PiusingMontyCarlo {

	public static void main(String[] args) {
		double x, y;
		int hits = 0;
		// int limit = Integer.MAX_VALUE;

		for (int i = 0; i < 1000; i++) {
			x = Math.random();
			y = Math.random();
			if (x * x + y * y <= 1)
				hits++;
		}

		System.out.println(4.0 * hits / 1000);
		System.out.println(Math.PI);

	}

}
