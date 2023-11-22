package main.java.com.galina_magazinova.javacore.task;

import java.util.HashMap;

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
        int[] array = new int[]{3, 8, 15, 17};
        int requiredSum = 23;

        int[] indices = findIndicesSum(array, requiredSum);
        System.out.println("[" + indices[0] + ", " + indices[1]+"]");
    }

    public static int[] findIndicesSum(int[] array, int requiredSum){
          int[] result = new int[2];
               HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i <array.length; i++){
            hm.put(array[i], i);
        }

        for (int i=0; i < array.length; i++){
            int value = requiredSum - array[i];

            if(hm.containsKey(value)){
               result[0] = hm.get(value);
               result[1] = i;
            }
        }

        return result;
    }
}
