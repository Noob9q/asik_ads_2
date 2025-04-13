public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();

    // Добавление элемента
    public void add(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    // Извлечение минимального
    public T poll() {
        if (isEmpty()) throw new IllegalStateException("Куча пуста");
        T min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }

    // Просмотр минимального
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Куча пуста");
        return heap.get(0);
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) < 0) {
                T temp = heap.get(index);
                heap.set(index, heap.get(parent));
                heap.set(parent, temp);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int smallest = index;

            if (left < size && heap.get(left).compareTo(heap.get(smallest)) < 0)
                smallest = left;
            if (right < size && heap.get(right).compareTo(heap.get(smallest)) < 0)
                smallest = right;

            if (smallest != index) {
                T temp = heap.get(index);
                heap.set(index, heap.get(smallest));
                heap.set(smallest, temp);
                index = smallest;
            } else break;
        }
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }
}
