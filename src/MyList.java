// Интерфейс MyList, описывает базовые методы для работы со списками
public interface MyList<T> extends Iterable<T> {

    // Добавить элемент в конец списка
    void add(T item);

    // Установить элемент по индексу
    void set(int index, T item);

    // Добавить элемент по индексу
    void add(int index, T item);

    // Добавить элемент в начало
    void addFirst(T item);

    // Добавить элемент в конец (аналог add)
    void addLast(T item);

    // Получить элемент по индексу
    T get(int index);

    // Получить первый элемент
    T getFirst();

    // Получить последний элемент
    T getLast();

    // Удалить элемент по индексу
    void remove(int index);

    // Удалить первый элемент
    void removeFirst();

    // Удалить последний элемент
    void removeLast();

    // Отсортировать список (если T реализует Comparable)
    void sort();

    // Вернуть индекс первого вхождения элемента
    int indexOf(Object object);

    // Вернуть индекс последнего вхождения элемента
    int lastIndexOf(Object object);

    // Проверка, существует ли элемент в списке
    boolean exists(Object object);

    // Вернуть список в виде массива
    Object[] toArray();

    // Очистить список
    void clear();

    // Вернуть количество элементов в списке
    int size();
}

