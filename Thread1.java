package thirteen_December;

public class Thread1  implements Runnable{

	@Override
	public void run() {

		System.out.println("Thread is running");
	
	}
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Thread1());
		thread1.start();
		
	}
	public Thread1() {
 
	}

}

