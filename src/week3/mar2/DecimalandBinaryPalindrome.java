package week3.mar2;

public class DecimalandBinaryPalindrome {

	public static void main(String[] args) {
		int i,k=0;
		for (i = 1; i <=1000000; i++) {
			String n = Integer.toString(i);
			String l = new StringBuffer(n).reverse().toString();
			
			if(n.equals(l))
			{
				StringBuffer br = new StringBuffer();
				int z=0;
				z=i;
				while (z >= 1) {
					if (z % 2 != 0) {
						br.append(1);
					} else if (z % 2 == 0) {
						br.append(0);
					}
					z = (z / 2);
				}
				String m=br.toString();
				
				String y=new StringBuffer(m).reverse().toString();
			
				if(m.equals(y))
		
				{
					k+=i;
				}

			} 
	
		}
		System.out.println(k);
	}

}
