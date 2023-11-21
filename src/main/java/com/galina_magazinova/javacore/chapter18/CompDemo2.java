package main.java.com.galina_magazinova.javacore.chapter18;
//использовать лямбда-выражение для создания обратного компаратора

import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {

        // передать обратный компаратор конструктору TreeSet через лямбда-выражение
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        // добавить элементы в tree set.
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
