package main.java.com.galina_magazinova.javacore.chapter18;

// Использование цикла foreach для прохода по коллекции

import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {

        //Создать ArrayList для целых чисел
        ArrayList<Integer> vals = new ArrayList<>();

        //добавить значения в ArrayList
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //использовать цикла для отображения значений
        System.out.println("Содержимое vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        //просуммировать значения в цикле
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Сумма значений: " + sum);
    }
}
