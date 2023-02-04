package queue;

public class Main {

	public static void main(String[] args) {
		QueueUsingLL queue = new QueueUsingLL();
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}

}
