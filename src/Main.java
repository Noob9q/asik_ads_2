//public class Main {
//    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//
//        System.out.println("Добавление элементов");
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        print(list); // 10 20 30
//
//        System.out.println("Добавление по индексу");
//        list.add(1, 99);
//        print(list); // 10 99 20 30
//
//        System.out.println("Добавление в начало и конец");
//        list.addFirst(1);
//        list.addLast(40);
//        print(list); // 1 10 99 20 30 40
//
//        System.out.println("Получение элементов");
//        System.out.println("get(2): " + list.get(2));       // 99
//        System.out.println("getFirst: " + list.getFirst()); // 1
//        System.out.println("getLast: " + list.getLast());   // 40
//
//        System.out.println("Удаление элементов");
//        list.remove(2);      // удалим 99
//        list.removeFirst();  // удалим 1
//        list.removeLast();   // удалим 40
//        print(list); // 10 20 30
//
//        System.out.println("Поиск элементов");
//        list.add(20);
//        System.out.println("indexOf(20): " + list.indexOf(20));         // 1
//        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20)); // 3
//        System.out.println("exists(30): " + list.exists(30));           // true
//        System.out.println("exists(100): " + list.exists(100));         // false
//
//        System.out.println("Сортировка");
//        list.add(5);
//        list.add(15);
//        list.sort();
//        print(list); // элементы в порядке: 5 10 15 20 20 30
//
//        System.out.println("toArray() и clear()");
//        Object[] array = list.toArray();
//        for (Object obj : array) {
//            System.out.print(obj + " ");
//        }
//        System.out.println();
//
//        list.clear();
//        // true
//    }
//
//    //  метод для печати списка
//    private static void print(MyArrayList<?> list) {
//        for (Object item : list) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MyLinkedList<String> list = new MyLinkedList<>();
//        System.out.println("Добавление");
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        print(list); // A B C
//
//        System.out.println("добавление по индексу");
//        list.add(1, "X");
//        print(list); // A X B C
//
//        System.out.println("== addFirst, addLast ==");
//        list.addFirst("Start");
//        list.addLast("End");
//        print(list); // Start A X B C End
//
//        System.out.println("== Получение элементов ==");
//        System.out.println("get(2): " + list.get(2));
//        System.out.println("getFirst: " + list.getFirst());
//        System.out.println("getLast: " + list.getLast());
//
//        System.out.println("== Удаление элементов ==");
//        list.remove(2);      // удалим X
//        list.removeFirst();  // удалим Start
//        list.removeLast();   // удалим End
//        print(list); // A B C
//
//        System.out.println("Поиск");
//        System.out.println("indexOf(\"B\"): " + list.indexOf("B"));
//        System.out.println("lastIndexOf(\"B\"): " + list.lastIndexOf("B"));
//        System.out.println("exists(\"Z\"): " + list.exists("Z")); //false
//
//        System.out.println("Сортировка");
//        list.add("D");
//        list.add("E");
//        list.sort();
//        print(list);
//
//        System.out.println("toArray и clear");
//        Object[] array = list.toArray();
//        for (Object obj : array) System.out.print(obj + " ");
//        System.out.println();
//
//        list.clear();
//        System.out.println("Размер после clear: " + list.size());
//    }
//
//    private static void print(MyLinkedList<?> list) {
//        for (Object item : list) System.out.print(item + " ");
//        System.out.println();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.pop()); // 30
//        System.out.println(stack.peek()); // 20
//        System.out.println(stack.size()); // 2
//    }
//}

