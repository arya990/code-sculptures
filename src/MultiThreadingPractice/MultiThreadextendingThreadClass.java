package MultiThreadingPractice;

/*
 * for multi threads it is not possible to say exact outputs because of the
 * unexpected behaviour or athread scheduler and garbage collector.\ so it
 * is possible to say possible outputs only. the ouput varies from time to
 * time as the thread scheduler decides the threads to run.
 */
public class MultiThreadextendingThreadClass extends Thread {

	public void run() // logics of thread bby overriding run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("userdefined thread");
		}
	}

	static class ThreadDemo {
		public static void main(String[] args) // main thread starts
												// automatically
		{ // user thread starting code
			MultiThreadextendingThreadClass t = new MultiThreadextendingThreadClass(); // instantiate
																						// thread
																						// class
			t.start(); // start the thread class
						// 2 threads running here main and user thread
			// logics of main thread
			for (int i = 0; i < 10; i++) {
				System.out.println("main thread");
			}
		}
	}
}
