package main.java.com.galina_magazinova.javacore.chapter18;

// Демонстрация использования Array List

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Создать ArrayList
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер al: " + al.size());

        //Добавить элементы
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер al после добавления элементов: " + al.size());

        //Отобразить ArrayList
        System.out.println("Содержимое al: " + al);

        //Удалить эелементы
        al.remove("F");
        al.remove(2);
        System.out.println("Размер al после удаления элементов: " + al.size());
        System.out.println("Содержимое al: " + al);
    }
}
