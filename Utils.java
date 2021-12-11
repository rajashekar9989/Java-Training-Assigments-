package ten_December;

import java.util.Arrays;

/* static class is a class declared  inside another class and mark static 
 * outer class is treated as a package 
 * nested classs can be private ,public or default 
 avg =sum of all elements /total number of elements 
 */
public class Utils {// outer class

	public static class Result {// inner class

		private final int count;
		private double sum;

		public Result(int count, double sum) {// inner class constructor
			this.count = count;
			this.sum = sum;

		}

		public double getAverage() {// inner class method
			if (count == 0) {
				System.out.println("count can not be zero");
				return 0;
			}
			return sum / count;
		}
	}
}

//	public static Result findSumAndAverage(int[] data) { // outer class method
//
//		Result result = new Result(data.length, Arrays.stream(data).sum());
//		return result;
//	}
//
//	public static void main(String[] args) { // outer class main method
//
//		int array[] = new int[] { 2, 6, 8, 4 };
//		int average = (int) findSumAndAverage(array).getAverage();
//		System.out.println(average);
//	}
//
//}
