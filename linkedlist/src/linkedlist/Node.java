package linkedlist;

public class Node {
	public int data;
	public Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
	static int countNodes(Node head) {
		int count = 0;
		Node current = head;
		while(current!=null) {
			current=current.next;
			count+=1;
		}
		return count;
	}
}
