package stack;


public class StackUsingLL {
	Node top;
	
	StackUsingLL() {
		this.top=null;
	}
	StackUsingLL(int data) {
		this.top=new Node(data);
	}
		
	void push(int data) {
		Node newNode = new Node(data);
		
		if(top==null) {
			top=newNode;
		} else {
			newNode.next=top;
			top=newNode;
		}
        System.out.println(data + " pushed to stack");
	}
	
	void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Pop "+ top.data);
			top=top.next;
		}
	}
	
	void peek() {
		if(top==null) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("the top of the stack is " + top.data);
		}
	}
	
	void printStack() {
		Node current = this.top;
		while(current != null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}
