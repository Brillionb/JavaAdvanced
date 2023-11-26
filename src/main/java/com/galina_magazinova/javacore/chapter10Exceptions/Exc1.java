package com.galina_magazinova.javacore.chapter10Exceptions;


//трассировка стека позволяет отследить последовательность вызовов методов, кот. привели к эксепшену

public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 42 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
