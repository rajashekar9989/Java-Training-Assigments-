package thirteen_December;

public class ThreadWithLambda {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread( ()->System.out.println("Run method is Running"));
           thread1.start();
	}

}
