package calculationMiniProject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainTask {
	public static void main(String[] args) {

	//	ExecutorService executorService = Executors.newCachedThreadPool();
 ExecutorService executorService1 = Executors.newFixedThreadPool(6);
		long startTime = System.nanoTime();
		for (int i = 0; i < 3; i++) {
			Future<Integer> result11 = executorService1.submit(new CalculationTaskC());
// Future<Integer> result12 = executorService.submit(new CalculationTaskC());
// Future<Integer> result13 = executorService.submit(new CalculationTaskC());
		}
// for(int i=1;i<100;i++)
// {
// for(int j=3*i;j<100;j++){

// Future<Integer> result2 = executorService1.submit(new CalculationTaskC());
// Future<Integer> result3 = executorService1.submit(new CalculationTaskC());
// Future<Integer> result4 = executorService1.submit(new CalculationTaskC());
// Future<Integer> result5 = executorService1.submit(new CalculationTaskC());
// Future<Integer> result6 = executorService1.submit(new CalculationTaskC());
		executorService1.shutdown();
// try
// {
// System.out.println("result11_" +result11.get());
// System.out.println("result12_" +result12.get());
// System.out.println("result13_" +result13.get());
// }
// // System.out.println("result1_" +result1.get());
// System.out.println("result2_" +result2.get());
// System.out.println("result3_" +result3.get());
// System.out.println("result3_" +result4.get());
// System.out.println("result3_" +result5.get());
// System.out.println("result3_" +result6.get());


		long elapsedTime = System.nanoTime() - startTime;
// System.out.println("Time taken "+ (elapsedTime/3));
		double millisecond = ((elapsedTime / 3) / 1000);// 403 millisec
// double millisecond1 = ((elapsedTime/6)/1000);//400 millisec
		System.out.println("Time taken in millisecond to execute all the tasks " + millisecond);
	}
}