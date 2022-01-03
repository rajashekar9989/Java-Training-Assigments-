package calculationMiniProject;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
public class CalculationTaskC implements Callable<Integer> {
private String name = "Thread_";
private int count = 0;
// private int data[]; @Override
public Integer call() throws Exception {
// String ThreadName = Thread.currentThread().getName();
System.out.println(Thread.currentThread().getName() + "Started working");
for (int i = 0; i < 10; i++) {
System.out.println(Thread.currentThread().getName() + " " + i);
}
System.out.println(Thread.currentThread().getName() + "stopped working");
return 0;
} public CalculationTaskC() {
count++;
name += count;
}
}
