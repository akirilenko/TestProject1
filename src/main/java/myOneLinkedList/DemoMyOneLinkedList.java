package myOneLinkedList;

public class DemoMyOneLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myOneLinkedList l = new myOneLinkedList();
		// добавление еллементов и печать списка после каждого добавления
		l.append(10);
		l.print();
		l.append(20);
		l.print();
		l.append(30);
		l.print();
		l.append(40);
		l.print();
		l.append(50);
		l.print();
		
		 l.prepend(60) ;
		l.print();
		

		// удаление елемента из списка по индексу
		l.removeByIndex(1);
		l.print();
		l.removeByIndex(2);
		l.print();

		l.removeByValue(40);
		l.print();

		// поиск не существующего  елемента по индексу
		Node findeNode = l.getByIndex(3);
		if (findeNode != null) {
			System.out.println(findeNode.getValue());
		} else {
			System.out.println("Node does not exists");
		}
		// поиск   существующего  елемента по индексу
		System.out.println("Node "+ l.getByIndex(1).getValue()); 
	}

}
