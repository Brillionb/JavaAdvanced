package main.java.com.galina_magazinova.javacore.chapter18;
// демонстрация использования LinkedList

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<>();

        //добавить элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Исходное содержимое ll: " + ll);

        //удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое ll после удаления: " + ll);

        //удалить первый и последний элемент
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое ll после удаления первого и последнего элементов: " + ll);

        // получить и установить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("Содержимое ll после изменения: " + ll);
    }
}
