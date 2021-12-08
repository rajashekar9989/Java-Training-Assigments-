package sixDecember;

import java.util.Scanner;

public class StcakExample {

	public static void main(String[] args) {

		StackImp stack = new StackImp();
		System.out.println("how many elements do you wnat add in the stack");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("enter the data");
			stack.push(scan.nextInt());
			System.out.println(" ");
		}
		System.out.println(
				"1.add new data/n" + "2.peek data /n" + "3. pop data /n" + "4.printstack /n " + "press -1 to exit");
		int choice = 0;
		do {
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the data");
				break;
			case 2:
				Integer data = stack.peek();
				if (data != null) {
					System.out.println(data);
					break;
				}
			case 3:
				Integer data1 = stack.pop();
				if (data1 != null) {
					System.out.println(data1);
					break;
				}
			case 4:
				stack.printStack();
				break;
			case -1:
				System.out.println("bye ...bye");
				break;
			default:

				System.out.println("please enter the valid data");
				break;

			}
		} while (choice != -1);

	}
}
