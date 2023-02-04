package queue;

public class QueueUsingLL {
	Node front;
	Node rear;
	
	QueueUsingLL(){
		this.front = this.rear = null;
	}
	
	// add to rear
	void enqueue(int data) {
		Node newNode= new Node(data);
		if(rear==null) {
			rear=front=newNode;
			System.out.println("Enqueue: "+ rear.data);
		} else {
			rear.next=newNode;
			rear=newNode;
			System.out.println("Enqueue: "+ rear.data);
		}
	}
	
	// remove from front
	void dequeue() {
		if(front==null && rear==null) {
			System.out.println("The queue is empty");
		} else {
			this.front=front.next;
			System.out.println("-------Dequeue------");
			this.printQueue();
		}
	}
	
	void printQueue() {
		Node current = this.front;
		if(front==null) {
			System.out.println("The queue is empty");
		}
		while(current != null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}
