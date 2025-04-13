import java.util.Iterator;
import java.util.NoSuchElementException;

// Реализация двусвязного списка
public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    // Внутренний класс — узел списка
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head; // первый элемент
    private MyNode tail; // последний элемент
    private int size = 0;

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode newNode = new MyNode(item);
            MyNode current = getNode(index);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void set(int index, T item) {
        getNode(index).data = item;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) throw new NoSuchElementException();
        return tail.data;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode toRemove = getNode(index);
        unlink(toRemove);
    }

    @Override
    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        unlink(head);
    }

    @Override
    public void removeLast() {
        if (tail == null) throw new NoSuchElementException();
        unlink(tail);
    }

    private void unlink(MyNode node) {
        if (node.prev == null) head = node.next;
        else node.prev.next = node.next;

        if (node.next == null) tail = node.prev;
        else node.next.prev = node.prev;

        size--;
    }

    private MyNode getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            MyNode current = head;
            for (int j = 0; j < size - 1 - i; j++) {
                if (current.data.compareTo(current.next.data) > 0) {
                    T tmp = current.data;
                    current.data = current.next.data;
                    current.next.data = tmp;
                }
                current = current.next;
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        for (MyNode current = head; current != null; current = current.next) {
            if (current.data.equals(object)) return index;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = size - 1;
        for (MyNode current = tail; current != null; current = current.prev) {
            if (current.data.equals(object)) return index;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        MyNode current = head;
        for (int i = 0; i < size; i++) {
            arr[i] = current.data;
            current = current.next;
        }
        return arr;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}

