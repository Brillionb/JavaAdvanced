package main.java.com.galina_magazinova.javacore.task;

import java.util.HashSet;

/**
 * Дан массив целых чисел.
 * Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты
 * <p>
 * Пример:
 * Array: [4,5,6,6,8]
 * Result: true
 * Число 6 повторяется 2 раза
 * <p>
 * Array: [4,5,6,7,8]
 * Result: false
 * Дубликатов нет
 */

public class module1_2_task2 {
    public static void main(String[] args) {

        int[] array = new int[]{4, 5, 6, 1, 8, 0};

        if (hasDuplicates(array)) {
            System.out.println("Массив имеет дубликаты");
        } else {
            System.out.println("Дубликатов нет");
        }
    }

    public static boolean hasDuplicates(int[] array) {
        HashSet<Integer> hs = new HashSet<>();

        for (int element : array) {
            if (!hs.add(element)) {
                return true;
            }
        }
        return false;
    }
}
