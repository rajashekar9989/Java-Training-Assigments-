package fourTeen_December;

/*
 *by using Anonymous class
 */
public class ThirdWayOfThread {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			public void run() {
				System.out.println("********[+Task+ ]start working ");
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
				}
				System.out.println("*********[+Task+]stopped working ");

				// System.out.println("inside the run method");
			}

		});
		thread.start();
	}
}
