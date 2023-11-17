package main.java.com.galina_magazinova.javacore.chapter18;

//Преобразование ArrayList в массив

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое al: " + al);

        // получить массив
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        // просуммировать элементы массива
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
