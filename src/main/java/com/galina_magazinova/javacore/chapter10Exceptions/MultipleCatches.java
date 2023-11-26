package com.galina_magazinova.javacore.chapter10Exceptions;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a; // деление на ноль
            int[] c = {1};
            c[42] = 99; // выход за пределы массива
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива " + e);
        }
        System.out.println("После блока операторов try/catch");
    }
}
