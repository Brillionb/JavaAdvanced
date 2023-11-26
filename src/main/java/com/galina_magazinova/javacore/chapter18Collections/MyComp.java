package com.galina_magazinova.javacore.chapter18Collections;
// использование специального компаратора

import java.util.*;

public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // Обратить сравнение
        return bStr.compareTo(aStr);
    }
        // переопределять equals() и методы со стандартной реализацией не требуется
}

class CompDemo {
    public static void main(String[] args) {
        // создать TreeSet.
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        // добавить элементы в TreeSet.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // отобразить элементы
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
