package fourTeen_December;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCreationUsingExcutors {

	public static void main(String[] args) {
// at a time three threads will only execute since we are using fixedThreadPool
// ExecutorService executorServices = Executors.newFixedThreadPool(3);
// ExecutorService executorServices = Executors.newCachedThreadPool();
		ExecutorService executorServices = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
//we are assigning task to the executor
			executorServices.submit(new ThreadTask());
		}
		executorServices.shutdown();
	}
}

class ThreadTask implements Runnable {
	String id = "Thread_";
	static int instance_number = 0;

	public void run() {
		System.out.println("******[" + id + "]started working*****");
		for (int i = 0; i < 10; i++) {
			System.out.println("<" + id + ">" + i);
		}
		System.out.println("******[" + id + "stopped working*****");
	}

	public ThreadTask() {
		instance_number++;
		id = id + instance_number;
	}
}
