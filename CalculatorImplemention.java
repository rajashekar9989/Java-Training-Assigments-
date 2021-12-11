package ten_December;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculationImplemention  implements Calculator {

	@Override
	public double sum (double[] date ) {
		// TODO Auto-generated method stub
		return Arrays.stream(date).sum();
	}

	@Override
	public double multification(double[] data) {
		// TODO Auto-generated method stub
		return Arrays.stream(data)
				.reduce(1, (ele1,ele2)->ele1*ele2);
	}

	@Override
	public double  add(double [] avg) {
		// TODO Auto-generated method stub
		return Arrays.stream(avg).sum();F
	}

//	@Override
//	public double add(int[] add) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
