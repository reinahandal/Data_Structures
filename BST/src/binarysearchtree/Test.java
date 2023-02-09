package binarysearchtree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
	    bst.add(6);
	    bst.add(4);
	    bst.add(8);
	    bst.add(3);
	    bst.add(5);
	    bst.add(7);
	    bst.add(9);
		System.out.println("in-order traversal");
		bst.inOrder(bst.root);
		System.out.println("pre-order traversal");
		bst.preOrder(bst.root);
		System.out.println("post-order traversal");
		bst.postOrder(bst.root);
		System.out.println("BFS traversal");
		bst.bfs();
		System.out.println("BST contains 13: " + bst.containsNode(13));
		System.out.println("BST contains 7: " + bst.containsNode(7));
	}

}
