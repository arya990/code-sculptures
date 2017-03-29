package MultiThreadingPractice;

/*
 * it is able to overload the run() but the thread class always calls 
 * 0 arg run() to call 1 arg run() we can call explicitly in the run().
 */
class ThreadDemo4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("o-arg user thread");
		} // run(10);
	}

	public void run(int a) {
		for (int i = 0; i < 10; i++) {
			System.out.println("1-arg user thread");
		}
	}
}

public class OverloadingrunMethod {
	public static void main(String[] args) {
		ThreadDemo4 t4 = new ThreadDemo4();
		t4.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
