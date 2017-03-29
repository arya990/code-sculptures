package MultiThreadingPractice;

/*
 *  when start() is given in the parent class then while executing 
 *  it first checks the parent class and executed. 
 *  here thread is not created becasue thread is created when the thread class start() is called not parents class.
 *  so it is not recommened to override the start() as thread will not be created.
 */
class ThreadDemo3 {
	public void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println("user thread");
		}
	}
}
public class StartMethodinThreadClass {
		public static void main(String[] args) {
			ThreadDemo3 t3 = new ThreadDemo3();
			t3.start();
			for (int i = 0; i < 10; i++) {
				System.out.println("main thread");
			}
		}
	}
