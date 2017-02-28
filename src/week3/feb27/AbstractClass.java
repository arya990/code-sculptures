package week3.feb27;

public class AbstractClass {
	abstract class Book {
		String title;

		abstract void setTitle(String s);

		String getTitle() {
			return title;
		}
	}

	public class MyBook extends Book {
		public void setTitle(String s) {
			s = "A Tale of Two Cities";
		}
//		String getTitle(){
//			return title;
//		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyBook a = new MyBook();
		System.out.println(a.getTitle());

	}

}
