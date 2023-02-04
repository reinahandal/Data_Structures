package stack;

public class Main {

	public static void main(String[] args) {
		StackUsingLL stack = new StackUsingLL();
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.push(11);
		stack.printStack();
		stack.pop();
		stack.push(3);
		stack.pop();
		stack.pop();
		stack.push(3);
		stack.printStack();
		stack.peek();
	}

}
