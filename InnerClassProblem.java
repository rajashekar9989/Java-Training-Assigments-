package ten_December;

public class InnerClassJavaProblem {// outer class

	 String s;

}

class Inner { // inner class

	InnerClassJavaProblem p = new InnerClassJavaProblem();// create a outer class object

	void testMethod() {
		p.s = "Set from Inner";
		System.out.println(p.s);
	}

	public static void main(String[] args) {

		Inner c = new Inner();
		c.testMethod();

	}
}
