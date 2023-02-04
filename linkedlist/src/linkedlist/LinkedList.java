package linkedlist;

public class LinkedList {
	Node head;
	
	LinkedList(int data){
		this.head=new Node(data);
	}
	LinkedList(){
		this.head=null;
	}
	
	// method to insert new node
	void insert(int data) {
		// create new node with given data
		Node newNode = new Node(data);
		// if LL is empty, insert node at head
		if(this.head==null) {
			this.head=newNode;
		}
		// else insert node at the end of the LL
		else {
			Node current = this.head;
			// we want to stop at the tail
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	// method to print LL
	void printLL() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	void insertToFront(int data) {
		// create new node with given data
		Node newNode = new Node(data);
		if(this.head==null) {
			this.head=newNode;
		} else {
			// make next of new node the head of the linked list
			newNode.next = this.head;
			// change pointer of head to point to new node
			this.head = newNode;		
		}
	}
	
	void insertAfterNode(int data, Node prevNode) {
		if(prevNode==null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		// create new node with given data
		Node newNode = new Node(data);
		// no need to iterate
		// change pointer of new node 
		// to point to the next of the previous node
		newNode.next=prevNode.next;
		// change pointer of previous node 
		// to point to new node
		prevNode.next=newNode;
	}
	
	void insertAfterKey(int key, int data) {
		Node newNode = new Node(data);
		Node curr = this.head;
		if(key==head.data) {
			newNode.next=head.next;
			head.next=newNode;
		}
		while(curr.data!=key) {
			curr=curr.next;
			if(curr==null) {
				return;
			}
		}
		newNode.next=curr.next;
		curr.next=newNode;
	}
	
	void deleteFromBeginning() {
		Node curr=this.head;
		this.head=head.next;
		curr.next=null;
	}
	
	void deleteFromEnd() {
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
	}
	
	void deleteFromMid(int key) {
		Node curr=head.next;
		Node prev=head;
		
		while(curr.data!=key) {
			curr=curr.next;
			prev=prev.next;
			if(curr==null) {
				return;
			}
		}
		prev.next=curr.next;
//		curr.next=null;
	}

	void reverseLL() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		this.head = prev;
	}
	
	boolean isEmpty() {
		if(head==null) {
			return true;
		} else return false;
	}
	
	int indexOf(int key) {
		Node curr = head;
		int index=0;
		while(curr.data != key) {
			curr=curr.next;
			index++;
			if(curr==null) {
				return -1;
			}
		}
		return index;
	}

	int elementAt(int target) {
		Node curr=head;
		int index=0;
		while(index != target) {
			curr=curr.next;
			index++;
			if(curr==null) {
				return -1;
			}
		}
		return curr.data;
	}
}
