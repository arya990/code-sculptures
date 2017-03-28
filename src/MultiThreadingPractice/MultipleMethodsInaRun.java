package MultiThreadingPractice;

//so for ultiple methods to run at a  time call all methods inside the run().
public class MultipleMethodsInaRun extends Thread {
	public void run() {
		m1();
		m2();
		m3();
	}

	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}

}

class ThreadDemo {
	public static void main(String[] args) {
		MultipleMethodsInaRun t5 = new MultipleMethodsInaRun();
		t5.start();
	}
}