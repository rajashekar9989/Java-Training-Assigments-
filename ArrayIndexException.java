package exceptionExamples;

//import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		
	//String[] data = {"raj","sai","anu","madhu"};
//		
//		
//		System.out.println(Arrays.toString(data));
//		for(int i =0;i< data.length;i++) {
//			System.out.println(data[i]);
//		}
		
	
	String[] data = {"raj","sai","anu","madhu"};
	try {
	 System.out.println("Array contains the data :");
	for(int i =0;i<=10;i++) {
		System.out.println(data[i]);
	}

	}
    catch(ArrayIndexOutOfBoundsException  e) {
	System.out.println("Array index out of bound ");
}
	finally {
	System.out.println("end of the program");
	}
}
}
	
		
		

	




