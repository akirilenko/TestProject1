package BinaryTree;

public class Node {
	Node left;
	Node right;
	int value;

	public Node(int value) {
		this.value = value;
	}

	public void insert(int newValue) {
		if (value <= newValue) {
			if (left == null) {
				left = new Node(newValue);
			} else {
				left.insert(newValue);
			}
		} else {
			if (right == null) {
				right = new Node(newValue);
			} else {
				right.insert(newValue);
			}
		}
	}

	public boolean isExists(int findValue) {
		if (value == findValue) {
			return true;
		} else {
			if (value <= findValue) {
				if (left == null) {
					return false;
				} else {
					return left.isExists(findValue);
				}
			} else {
				if (right == null) {
					return false;
				} else {
					return right.isExists(findValue);
				}
			}
		}
	}

	public void printInOrder() {
		if (left != null) {
			left.printInOrder();
		}
		
		System.out.println(value);
		
		if (right != null) {
			right.printInOrder();
		}
	}

	public void printPreOrder() { 
		
		System.out.println(value); 
		if (left != null) {
			left.printPreOrder();
		} 		
		if (right != null) {
			right.printPreOrder();
		}
	}
	
public void printPostOrder() { 
		if (left != null) {
			left.printPostOrder();
		} 
		if (right != null) {
			right.printPostOrder();
		} 
		System.out.println(value);
	}

}
