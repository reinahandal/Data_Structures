package linkedlist;

public class Main {
	public static void main (String[] args) {		
		LinkedList list = new LinkedList(6);
		list.insert(4);
		list.insert(7);
		list.insert(2);
		list.insert(9);
		list.insert(1);
		System.out.println("This is our linked list");
		list.printLL();
		System.out.println("The linked list contains: " + Node.countNodes(list.head) + " nodes");
		
//		list.insertToFront(8);
//		System.out.println("this is our list after inserting a new node at the beginning");
//		list.printLL();
//		
//		list.insertAfterNode(3, list.head.next.next);
//		System.out.println("this is our list after inserting a new node after the third node");
//		list.printLL();
//		
//		list.insertAfterKey(9, 11);
//		System.out.println("this is our list after inserting a node after 9");
//		list.printLL();
//		
//		list.deleteFromMid(2);
//		System.out.println("This is our list after deleting");
//		list.printLL();	
	
//		list.reverseLL();
//		System.out.println("This is our list after reversing");
//		list.printLL();
//		System.out.println(list.isEmpty());
		
//		System.out.println(list.indexOf(9));
//		System.out.println(list.elementAt(9));
	}
}
