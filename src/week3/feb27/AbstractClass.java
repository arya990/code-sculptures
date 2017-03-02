package week3.feb27;

public class AbstractClass {
	abstract class Book {
		String title;

		abstract void setTitle(String s);

		String getTitle() {
			return title;
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		MyBook a = new MyBook();
		System.out.println(a.getTitle());

	}

}

public class MyBook extends AbstractClass.Book {
	public void setTitle(String s) {
		s = "A Tale of Two Cities";
	}
	// String getTitle(){
	// return title;
	// }

}

/*
The value of the variable title is not set, that means setTitle() method is not called and hence you are getting null as output.
You need to call setTitle() before calling getTitle() from your Main method as below:
public static void main(String[] args) {

		MyBook a = new MyBook();
		a.setTitle("A Tale of Two Cities");
		System.out.println("The title is: "+a.getTitle());

	}
Also modify your setTitle() method in MyBook class as below:
public void setTitle(String s) {
		this.title = s;
	}
By doing this way, whatever value we enter from Main method, the value gets set to title variable in your Book class.
The value need not be "A Tale of Two Cities" in particular, the above setTitle() works for any value of title we pass from Main method.
It's a good practice to write a setter method in the above format.
*/
