package exceptionExamples;

import java.util.Scanner;

public class ArthmeticExceptionExample {

	public static void main(String[] args) {
		
	try {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		  int  a =scan.nextInt();
		  System.out.println("enter another number");
		  int   b =scan.nextInt();
		
		System.out.println(a/b);
		}
	catch(Exception  e) {
		System.out.println("According to maths rule we cannot divide any number by zero ");
		System.out.println("please enter proper number  ;");
}		finally {	           
			System.out.println("thank you !");
			
		}
	}

}

