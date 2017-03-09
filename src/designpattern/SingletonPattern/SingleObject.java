package designpattern.SingletonPattern;

public class SingleObject {
	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	}

	public static SingleObject getinstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("ismail");
	}
}
