package exceptionExamples;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		NullPointerExceptionExample n1 = null;
     
	//	n1.addTwoNumbers();
//		if (n1 == null) {// this == method compares the references address of objects
//			n1 = new NullPointerExceptionExample();
	
//		}
	//	n1.addTwoNumbers();

         if(n1.equals(null)) { // this method  is compares the content or values of  object
        	 n1.addTwoNumbers();

	}

	 

	}

	void addTwoNumbers() {
		int add = 6 + 3;
		System.out.println("the result of  add is :" + add);

	}

}
