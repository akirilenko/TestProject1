package myLinkedList;

public class Node<E> {
    public E value;
    public Node<E> next;
    public Node<E> prev;

    public Node(Node l, E obj, Object next) {
    }

    public Node(E value) {
        this.value = value;
    }

    public Node(Node<E> prev, E value, Node<E> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}


