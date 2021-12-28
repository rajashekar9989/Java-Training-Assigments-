package fourTeen_December;

public class FourthWayOfThread {
	public static void main(String[] args) {

		Thread thread = new Thread(() -> { // creating thread with lambda

			System.out.println("********[+Task+ ]start working ");
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
			System.out.println("*********[+Task+]stopped working ");

			// System.out.println("inside the run method");

		});
		thread.start();
	}
}
