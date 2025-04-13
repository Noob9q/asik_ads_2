public class MyQueue<T extends Comparable<T>> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    // Добавить элемент в очередь (в конец)
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Удалить элемент из начала
    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Очередь пуста");
        T first = list.getFirst();
        list.removeFirst();
        return first;
    }

    // Получить первый элемент
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Очередь пуста");
        return list.getFirst();
    }

    // Проверка на пустоту
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Размер очереди
    public int size() {
        return list.size();
    }
}
