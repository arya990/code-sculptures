package MultiThreadingPractice;

/*
 * if we r not not overriding the run method then the empty implementation will be xecuted
 * but it is always recommmened to write run method instead of giving empty implementations.
 */
class ThreadDemo2 extends Thread {
}

public class NoRunMethodOverriding {
	public static void main(String[] args) {
		ThreadDemo2 t2 = new ThreadDemo2();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}