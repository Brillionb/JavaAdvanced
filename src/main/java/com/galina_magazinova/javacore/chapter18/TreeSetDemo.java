package main.java.com.galina_magazinova.javacore.chapter18;
//Демонстрация использование TreeSet

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        //Создать TreeSet
        TreeSet<String> ts = new TreeSet<>();

        //добавить элементы
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts); //[A, B, C, D, E, F]

        System.out.println(ts.subSet("C", "F")); // [C, D, E]  - C включается, F исключается
    }
}
