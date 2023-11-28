package com.galina_magazinova.javacore.task;

import java.util.HashMap;
import java.util.Map;

/**
 * Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы элементов массива, значения
 * которых в сумме дают число, переданное в массив.
 * <p>
 * Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
 * Один и тот же элемент не может быть использован дважды. (Берем только 2 элемента)
 * <p>
 * array = [3, 8, 15, 17], Number = 23
 * result = [1,2]
 * <p>
 * Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
 */


public class module1_2_task1 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 4};
        int requiredSum = 7;

        int[] indices = findIndicesSum(array, requiredSum);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }

    public static int[] findIndicesSum(int[] array, int requiredSum) {
        Map<Integer, Integer> arrayValueIndexMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int value = requiredSum - array[i];

            if (arrayValueIndexMap.containsKey(value)) {
                return new int[]{arrayValueIndexMap.get(value), i};
            }

            arrayValueIndexMap.put(array[i], i);
        }

        return null;
    }
}
