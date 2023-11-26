package com.galina_magazinova.javacore.chapter10Exceptions;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это сообщение не будет выведено");
        } catch (ArithmeticException e) { //перехватить ошибку деления на ноль
            System.out.println("Деление на ноль");
        }
        System.out.println("После блока catch");
    }
}
