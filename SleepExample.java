package thirteen_December;

import java.time.Instant;
import java.util.Arrays;

public class SleepExample extends Thread  {
	 String []data = new String[] {"data1","data2","data3","data4"};
	public SleepExample() {
		
	}
	public void run() {
		Arrays.stream(data).forEach(element->{
			try {
				//System.out.println("before sleep :"+Thread.currentThread().getState());
				Thread.sleep(1000);
				//System.out.println("After  sleep :"+Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(element) ;
			});
			
		}
	

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("In main");
		SleepExample example = new SleepExample();
		System.out.println(example.getState());
		example.start();
		System.out.println(example.getState());
	//	System.out.println("finished main");
		try {
			example.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
