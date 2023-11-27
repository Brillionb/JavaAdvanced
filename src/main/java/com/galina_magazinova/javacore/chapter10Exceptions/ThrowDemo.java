package com.galina_magazinova.javacore.chapter10Exceptions;

// продемонстрировать применение оператора throw

public class ThrowDemo {
    public static void demoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в методе demoproc ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват " + e);
        }
    }
}
