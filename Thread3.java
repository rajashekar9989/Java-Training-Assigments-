 package thirteen_December;

public class Thread3 extends Thread{// extends thread class so all the Thread  public methods also there inside the Thread class
	
	public void run() {
		
		System.out.println("Inside Run Method");
	}

	public static void main(String[] args) {

		/*
		 *if we want to access the current executing  thread object 
		 *we call thread class static method into current thread
		 */
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getState());
//		System.out.println(Thread.currentThread().getThreadGroup());
		
		Thread thread = new Thread();// initiated the Thread class object
		thread.start();
		thread.setName("demo_thread");
		thread.setPriority(3);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.currentThread().getId());
		System.out.println(thread.currentThread().getState());
		System.out.println(thread.currentThread().getThreadGroup());
		System.out.println("create a  new initiated ");
		
Thread thread4 = new Thread();// initiated the Thread class object. thread is in new state
	thread4.start();// when we call start method that is runnable state
		System.out.println(thread4.currentThread().getName());
		System.out.println(thread4.currentThread().getPriority());
		System.out.println(thread4.currentThread().getId());
		System.out.println(thread4.currentThread().getState());
		System.out.println(thread4.currentThread().getThreadGroup());
	
	}
}

