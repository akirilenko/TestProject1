package myLinkedList;

public class TestMyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Node first = new Node(3);
		Node middle = new Node(5);
		first.next = middle;
		Node last = new Node(7);
		middle.next = last;
		*/
		
		// LinkedList c = new LinkedList ();
		MyLinkedList myLink = new MyLinkedList();
		
		myLink.add(1);
		System.out.println(myLink.print());
		myLink.add(2);
		System.out.println(myLink.print());
		myLink.add(20);
		System.out.println(myLink.print());
		myLink.add(10);
		System.out.println(myLink.print());
	 
		System.out.println(myLink.print_back() +"The end"); 
		
		
		System.out.println(myLink.getByIndex(2).value);
		
		System.out.println("Removing started");
		myLink.removeByValue(20);
		System.out.println(myLink.print());
		myLink.removeByValue(1);
		System.out.println(myLink.print());
		myLink.removeByValue(2);
		System.out.println(myLink.print());
		myLink.removeByValue(10);
		System.out.println(myLink.print() +"The end"); 
		 
		
		
	}

}
