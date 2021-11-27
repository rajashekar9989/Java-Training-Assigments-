
package javaTraining;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int temp = num, rev = 0, rem;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev + (rem * rem * rem);

		}
		if (temp == rev) {
			System.out.println(temp + " " + "Is an Armstrong number:");
		} else {
			System.out.println(temp + " " + "Is not Armstrong:");
		}
	}
}