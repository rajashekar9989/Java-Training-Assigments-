package streamProjectEx1;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatEx1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
  Predicate<Integer>eligibleForvote = input -> (input>=18);// predicate is functional interface .it provides the boolean return type
  System.out.println("Enter a Age");
  int  age =scan.nextInt();
  
  
  System.out.println("is user is eligible for voting :"+eligibleForvote.test(age));
	}

}
