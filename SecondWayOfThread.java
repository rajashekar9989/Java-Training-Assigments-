package fourTeen_December;

/*
 *by implementing the runnable interface 
 *this is functional interface provide a one abstract method  called by run
 */
public class SecondWayOfThread {

	public static void main(String[] args) {
		SecondThread secondthread = new SecondThread();
		Thread thread = new Thread(secondthread);// creating a thread by runnable obj:
		thread.start();

	}

}

class SecondThread implements Runnable {

	String Id = "thread_";
	static int countNumber = 0;

	public void run() {
		System.out.println("********[" + Id + "]start working ");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("*********[" + Id + "]stopped working ");

		// System.out.println("inside the run method");
	}

	public SecondThread() {
		countNumber++;
		Id = Id + countNumber;
		// this.start();
	}

}
