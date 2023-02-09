package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	public TreeNode root;
	
	public BinarySearchTree(int val) {
		root = new TreeNode(val);
	}
	
	public BinarySearchTree() {
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	// recursive method to insert nodes
	private TreeNode addRecursive(TreeNode root, int val) {
		if(root==null) {
			return new TreeNode(val);
		}
		if(val<root.value) {
			root.left = addRecursive(root.left, val);
		}
		else if(val>root.value) {
			root.right = addRecursive(root.right, val);
		} else {
			// value already exists
			return root;
		}
		
		return root;
	}
	
	// method that starts the recursion from the root node
	public void add(int val) {
		this.root = addRecursive(root, val);
	}
	
	//////////////// depth-first search ///////////////
	
	// in-order DFS traversal 
	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(" " + root.value);
			inOrder(root.right);
		}
	}
	
	// pre-order DFS traversal 	
	public void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.println(" " + root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	// post-order DFS traversal 
	public void postOrder(TreeNode root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(" " + root.value);
		}
	}
	
	// breadth-first search using a queue
	public void bfs() {
		if(root==null) {
			return;
		}
		Queue<TreeNode> nodes = new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty()){
			TreeNode node = nodes.remove();
			System.out.println(" " + node.value);
			if(node.left!=null) {
				nodes.add(node.left);
			}
			if(node.right!=null) {
				nodes.add(node.right);
			}
		}
	}
	
	// recursive method that traverses tree to check
	// if value exists in tree
	private boolean containsNodeRecursive(TreeNode root, int val) {
		if(root==null) {
			return false;
		}
		if(root.value==val) {
			return true;
		}
		else if(val < root.value) {
			return containsNodeRecursive(root.left, val);
		}
		else {
			return containsNodeRecursive(root.right, val);
		}
	}
	
	// public method that starts recursion at root node
	public boolean containsNode(int val) {
		return containsNodeRecursive(this.root, val);
	}
}
