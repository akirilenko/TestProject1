package MyGenericLinkedList;

import myLinkedList.MyLinkedList;

public class TestMyGenericLinkedList {

	public static void main(String[] args) {
		MyGenericLinkedList myLink = new MyGenericLinkedList();
		
		myLink.add("1");
		System.out.println(myLink.print());
		myLink.add("2");
		System.out.println(myLink.print());
		myLink.add("20");
		System.out.println(myLink.print());
		myLink.add("10");
		System.out.println(myLink.print());
	 
		System.out.println(myLink.print_back() +"The end"); 
		
		
		System.out.println(myLink.getByIndex(2).value);
		
		System.out.println("Removing started");
		myLink.removeByValue("20");
		System.out.println(myLink.print());
		myLink.removeByValue("1");
		System.out.println(myLink.print());
		myLink.removeByValue("2");
		System.out.println(myLink.print());
		myLink.removeByValue("10");
		System.out.println(myLink.print() +"The end"); 
		 
		
		
	}

}
