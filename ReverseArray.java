package javaTraining;

import java.util.Scanner;

public class ReverseArray {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements:");
		for (int i1 = 0; i1 < arr.length; i1++) {
			arr[i1] = sc.nextInt();
		}
		System.out.println("after reversing: ");
		
		for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
                                                                                      // swap the values at the left and right indices
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
                                                                                    // Printing the Array after reverse
		System.out.print("Reverse Array :");
		for (int val : arr)
			System.out.print(" " + val);
	}
}
