package MyGenericLinkedList;

public class Node <T> {
    public T  value;
    public Node next;
    public Node prev;

    public Node( ) {
    }
    public Node(T value) {
        this.value = value;
    }

    public Node( Node prev, T value,  Node next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public  Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
