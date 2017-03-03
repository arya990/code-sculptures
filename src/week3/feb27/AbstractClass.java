package week3.feb27;

abstract class Book {
	public String title;

	public abstract void setTitle(String title);

	public String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	public void setTitle(String s) {
		this.title = s;
	}

	public String getTitle() {
		return title;
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		MyBook a = new MyBook();
		a.setTitle("A Tale of two cities");
		System.out.println("the title is:" + a.getTitle());

	}

}
