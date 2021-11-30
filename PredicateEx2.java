package streamProjectEx1;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		
		Predicate<Integer>minimumAgeRequired = input -> (input>=10);
		Predicate<Integer>maximumAgeRequired =input ->(input<=55);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		 int age =scan.nextInt();
		 boolean result = maximumAgeRequired.and(minimumAgeRequired).test(age);
		 if(result) {
			 System.out.println("eligible for policy");
		 }
		 else {
			 System.out.println("not eligible for policy");
		 }

	}

}
