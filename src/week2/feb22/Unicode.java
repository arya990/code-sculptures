package week2.feb22;

public class Unicode {

	public static void main(String[] args) {
		for(int i=0;i<=64000;i++){
			String hex= Integer.toHexString(i);
			System.out.println(hex+"="+"\\u"+hex);
		}
	}

}
