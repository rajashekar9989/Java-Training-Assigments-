package ten_December;

import java.util.Arrays;

import ten_December.Utils.Result;

public class StaticNestedClassEx {

	public static Result findSumAndAverage(int[] data) { // outer class method

		Result result = new Result(data.length, Arrays.stream(data).sum());
		return result;
	}

	public static void main(String[] args) { // outer class main method

		int array[] = new int[] { 2, 6, 8, 4 };
		int average = (int) findSumAndAverage(array).getAverage();
		System.out.println(average);
	}

}
