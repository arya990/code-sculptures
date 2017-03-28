package MultiThreadingPractice;

/*
 * difference between t.start() and t.run():
 * instead of t.start() if w write t.run() then thread wont be created.
 * t.start()		 thread start executed user thread is created
 * t.run()			run() will be executed just like a normal method call. so thread is not created.
 */
public class Differenceintrunandtstart extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("user thread");
		}
	}
}

class ThreadDemo1 {
	public static void main(String[] args) {
		Differenceintrunandtstart t1 = new Differenceintrunandtstart();
		t1.run();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
