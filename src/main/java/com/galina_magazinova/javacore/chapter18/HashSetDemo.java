package main.java.com.galina_magazinova.javacore.chapter18;

// Демонстрация работы HashSet

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Создать hash таблицу
        HashSet<String> hs = new HashSet<>();

        //Добавить элементы
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
