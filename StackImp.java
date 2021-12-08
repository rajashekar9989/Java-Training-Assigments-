package sixDecember;

import java.util.LinkedList;

public class StackImp {
	// Instantiated the LinkedList
	private LinkedList stack = new LinkedList();

	public StackImp() {

	}

	public void push(int data) {
		stack.addFirst(data);

	}

// retrieve the data but do not want to remove from stack

	public Integer peek() {

		if (isEmpty()) {
			System.out.println("stack is empty ,there is no data to process");
			return null;
		}
		return (Integer) stack.peek();

	}
// retreive the data and  remove from the stack too

	public Integer pop() {
		
		if (isEmpty()) {
			System.out.println("stack is empty ,there is no data to process");
			return null ;
		}
		return (Integer) stack.pop();
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void printStack() {
		if (stack.isEmpty()) {
			System.out.println("stack is empty ,there is no data to process");
			return;
		}
		stack.forEach(data -> System.out.print(data + " ->"));
	}
}
