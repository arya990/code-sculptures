package week3.feb27;

/*Following is an example of abstract class:
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}


If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 


You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
Your task is to write just the MyBook class where you can implement the setTitle method of Book class. Your main method should create an object of MyBook class and provide the following output:
*/
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
