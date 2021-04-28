package myOneLinkedList;

public class myOneLinkedList {

	private int size = 0;
	private Node head;

	public myOneLinkedList() {
	}

	private boolean indexExists(int index) {
		return (index >= 0 & index < size);
	}

	public Node getByIndex(int index) {
		if (indexExists(index)) {
			
			Node x = head;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;

		}
		// тут нужно дописать обработку ошибки если индекс не в диапазоне
		else
			return null;

	}

	public void append(int obj) {
		Node x = head;
		if (x == null) {
			// создаем новую ноду
			head = new Node(obj);
		} else {
			while (x.next != null) {
				x = x.next;
			}
			// создаем новую ноду
			x.next = new Node(obj);
		}
		// увеличиваем размер списка на единицу
		size++;
	}

	public void prepend(int obj) {
		Node newHead = new Node(obj);
		newHead.next = head;
		head = newHead;
		size++;
	}

	public boolean removeByValue(int obj) {
		if (head == null) {
			return false;
		}
		if (head.value == obj) {
			head = head.next;
			return true;
		}
		Node x = head;
		while (x.next != null) {
			if (x.next.value == obj) {
				x.next = x.next.next;
				size--;
				return true;
			}else {x=x.next;}
		}
		return false;

	}

	public boolean removeByIndex (int index) {
		if (index >size-1& index<0) {
			return false;
		}
		if (index == 0) {
			head = head.next;
			size --;
			
			return true;
		} 
  
		Node prevDeleteOne = getByIndex (index-1);
		Node nextDeleteOne = getByIndex (index+1) ;
		
		prevDeleteOne.next  =nextDeleteOne;
		size --;
		return true;

	}

	public  void print() {
		String s = "";
		
		for (Node x=head; x != null; x = x.next) {
			s = s + x.value + " ";
		}
		  System.out.println (s);
	}

}
