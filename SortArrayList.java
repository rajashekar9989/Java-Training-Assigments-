package compareMethod;

import java.util.*;

public class SortArrayList {
	public static void main(String[] args) {
		List<Project> h1 = new ArrayList();
		h1.add(new Project(123, "Mize", "SoftwareServices", 21));
		h1.add(new Project(124, "Persistent", "SoftServices", 7));
		h1.add(new Project(125, "Kafka", "IntegrationServices", 5));
		System.out.println("Before sorting: ");
		System.out.println(h1 + " \n ");
		Collections.sort(h1);
		Collections.reverse(h1);
		System.out.println("After sorting: ");
		System.out.println(h1);
	}
}
