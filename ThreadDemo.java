package thread_Examples;

public class ThreadDemo extends Thread {
	
	
	public  void run() {
		System.out.println("Run method  is executed by jvm");
	}
public static void main(String[] args) {
	
	ThreadDemo  thread = new ThreadDemo();
	    Thread t = new Thread(thread);
	    t.start();
}
}


