package fourTeen_December;

public class FirstWayOfThread {

	public static void main(String[] args) {
		// instantiating the thread object
		FirstThread thread_0 = new FirstThread();
		System.out.println("first thread1 state :" + thread_0.getState());
		thread_0.start();
		FirstThread thread_1 = new FirstThread();
		System.out.println("second  thread2 state :" + thread_1.getState());
		thread_1.start();
		FirstThread thread_2 = new FirstThread();
		System.out.println("third  thread3 state :" + thread_2.getState());// Thread state is new
		// to move from new to runnable state
		thread_2.start();

	}

}

class FirstThread extends Thread {

	String Id = "Thread_";
	static int count = 0;

	// run method is help us to define task to be done by thread
	public void run() {
		System.out.println("********[" + Id + "]start working ");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("*********[" + Id + "]stopped working ");

		// System.out.println("inside the run method");
	}

	public FirstThread() {
		count++;
		Id = Id + count;

		// this.start();
	}
}
