package MultiThreadingPractice;

/*
 * if we r not not overriding the run method then the empty implementation will be xecuted
 * but it is always recommmened to write run method instead of giving empty implementations.
 */
public class NoRunMethodOverriding extends Thread {
}

class ThreadDemo2 {
	public static void main(String[] args) {
		NoRunMethodOverriding t2 = new NoRunMethodOverriding();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}