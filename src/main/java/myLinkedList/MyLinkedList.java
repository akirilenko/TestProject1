package myLinkedList;

import myLinkedList.Node;

public class MyLinkedList<E> {
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
    }

    private boolean indexExists(int index) {
        return (index >= 0 & index < size);
    }

    public Node<E> getByIndex(int index) {
        if (indexExists(index)) {
            // Делим размер списка пополам и если индек меньше половины ,
            // то ищем с начала списка иначе исщем с конца списка
            if (index < (size / 2)) {
                Node<E> x = first;
                for (int i = 0; i < index; i++)
                    x = x.next;
                // когда дошли до нужного номера еллемента - возвращаем его
                return x;
            } else {
                Node<E> x = last;
                for (int i = size - 1; i > index; i--)
                    x = x.prev;
                // когда дошли до ножногономера еллемента - возвращаем его
                return x;
            }
        }
        // тут нужно дописать обработку ошибки если индекс не в диапазоне
        else
            return null;

    }

    public void add(E obj) {
        Node<E> l = last;
        // создаем новую ноду , которой передаем в  начало
        // ссылку на ноду которая была ранее концом списка
        // конец списка определяем как ПУСТО
        Node newOne = new Node(l, obj, null);
        last = newOne;
        // если конец у текущего списка определен как ПУСТО, то/
        // то это создание первого елемента
        if (l == null)
            first = newOne;
        else
            // иначе дописываем ранее последнем у елементу
            // ссвлку на следующий, который мы вставляем
            l.next = newOne;
        // увеличиваем размер списка на единицу
        size++;
    }

    public boolean removeByValue(E o) {
        for (Node<E> x = first; x != null; x = x.next) {
            if (x.value == o) {
                Node<E> next = x.next;
                Node<E> prev = x.prev;

                if (prev == null) {
                    first = next;
                } else {
                    prev.next = next;
                    x.prev = null;
                }

                if (next == null) {
                    last = prev;
                } else {
                    next.prev = prev;
                    x.next = null;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public String print() {
        String s = "";
        for (Node<E> x = first; x != null; x = x.next) {
            s = s + x.value + " ";
        }
        return s;
    }

    public String print_back() {
        String s = "";
        for (Node<E> x = last; x != null; x = x.prev) {
            s = s + x.value + " ";
        }
        return s;
    }
}
