package week3.mar6;

public class ConsecutivePrimeSUm {

	public static void main(String[] args) {
		int sum=0;
		int number=2;
		
		while ((sum+number)<1000000) {
			if(Prime(number)){
				sum=sum+number;
				if(Prime(sum)){
					System.out.println(sum);
				}
			}
			number++;
			
		}
		
		System.out.println(sum);
	}

	private static boolean Prime(int number) {
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0&&number!=i){
				return false;
			}
		}
		return true;
	}

}
