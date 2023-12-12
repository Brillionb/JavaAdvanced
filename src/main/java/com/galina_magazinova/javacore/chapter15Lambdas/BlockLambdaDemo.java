package com.galina_magazinova.javacore.chapter15Lambdas;
// блочное лямбда выражение, которое вычисляет факториал значения int

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал 3 равен " + factorial.func(3));
        System.out.println("Факториал 5 равен " + factorial.func(5));
    }
}
