package thread_Examples;

public class MultiDemo implements Runnable {
 String name;
 
 MultiDemo(String name1){
	 name=name1;
	 
 }
	@Override
	public void run() {
		
		for(int i =1;i<=10;i++) {
			try {
				Thread.sleep(1000 );
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				//System.out.println(e);
				
			}
			System.out.println(name +" : " +i);
		}
		//System.out.println("Thread is running");
		//Thread t =Thread.currentThread();
	//	System.out.println(t);
		
	} 
	public static void main(String[] args) {
		MultiDemo m1 = new  MultiDemo("Thread1");
		MultiDemo m2 = new  MultiDemo("Thread2");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =1;i<=10;i++)
		{
			System.out.println("main : "+i);
		}
		//Thread t =Thread.currentThread();
	//	System.out.println(t);
		                  
		
	}
	

}
