package MultiThreadingPractice;

/*
 * difference between t.start() and t.run():
 * instead of t.start() if w write t.run() then thread wont be created.
 * t.start()		 thread start executed user thread is created
 * t.run()			run() will be executed just like a normal method call. so thread is not created.
 */
class ThreadDemo1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("user thread");
		}
	}
}

public class Differenceintrunandtstart {
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
