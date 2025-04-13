public class MyStack<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    // Добавить элемент в стек (в конец)
    public void push(T item) {
        list.addLast(item);
    }

    // Удалить верхний элемент
    public T pop() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст");
        T last = list.getLast();
        list.removeLast();
        return last;
    }

    // Получить верхний элемент
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст");
        return list.getLast();
    }

    // Проверка на пустоту
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // Размер стека
    public int size() {
        return list.size();
    }
}

