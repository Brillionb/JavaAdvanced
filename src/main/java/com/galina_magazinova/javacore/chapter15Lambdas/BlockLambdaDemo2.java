package com.galina_magazinova.javacore.chapter15Lambdas;

// блочное лямбда выражение, которое изменяет порядок следования символов
// в строке на противоположный

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Строка Lambda  с противоположным порядком следования символов " + reverse.func("Lambda"));
        System.out.println("Строка Expression  с противоположным порядком следования символов " + reverse.func("Expression"));
    }
}
