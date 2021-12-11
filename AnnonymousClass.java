package ten_December;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AnnonymousClass {

	public static void main(String[] args) {
		Calculator calculator = new Calculator() {

			@Override
			public double sum(double[] dat) {
				// TODO Auto-generated method stub
				return Arrays.stream(dat).sum();
			}

			@Override
			public double multification(double[] data) {
				// TODO Auto-generated method stub
				return Arrays.stream(data).reduce(1, (ele1, ele2) -> ele1 * ele2);
			}

			@Override
			public double add(int[] add) {
				// TODO Auto-generated method stub
				return Arrays.stream(add).sum();
			}

		};
		System.out.println(calculator.sum(new double[] { 2.0, 4.0, 6.0, 8.0, 10.0 }));
		System.out.println(calculator.multification(new double[] { 2.0, 4.0, 6.0, 8.0, 10.0 }));
		System.out.println(calculator.add(new int[] { 2, 2, 3, 4, 5, 6, }));
	}
}
