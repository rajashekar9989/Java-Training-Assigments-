
package javaTraining;

import java.util.Scanner;

public class SumOfAllDigitNum {

	public static void main(String[] args) {
		
			int  num,sum = 0, rem ; 
			System.out.println("Enter a Number");
			Scanner ref =  new Scanner(System.in);
		num	=	ref.nextInt();
			while (num > 0) { 
				rem = num % 10;
				sum = sum + rem;
				num = num / 10;
				}
			System.out.println("Sum is:" + sum);
		}

	}

