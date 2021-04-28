package BinaryTree;

import java.util.Scanner;

public class DemoBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Do you want insert new node to the tree?");

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim().toUpperCase();
		System.out.println("Set the Root");
		s = scan.nextLine().trim() ;
		Node root = new Node ( Integer.valueOf(s)) ; 
		
		System.out.println("Do you want set one more node?");
		s = scan.nextLine().trim().toUpperCase();
		
		if (s.equals("Y")) {
			while (s.equals("Y")) {
				System.out.println("Set the value for new node");
				s = scan.nextLine().trim().toUpperCase();
				root.insert(Integer.valueOf(s)); 
				
				System.out.println("Do you want set one more node?");
				s = scan.nextLine().trim().toUpperCase();
				
			}

		}
		System.out.println("Tree content InOrder print");
		root.printInOrder();
		
		System.out.println("Tree content PreOrder print");
		root.printPreOrder();
		
		System.out.println("Tree content PostOrder print");
		root.printPostOrder();
	}

}
