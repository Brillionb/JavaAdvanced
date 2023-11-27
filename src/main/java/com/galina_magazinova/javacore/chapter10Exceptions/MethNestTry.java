package com.galina_magazinova.javacore.chapter10Exceptions;

//операторы try могут быть неявно вложены в вызовы методов
public class MethNestTry {
    static void nesttry(int a){
        try {
            if (a == 1) {
                a = a / (a - a); // деление на ноль
            }
            if (a == 2) {
                int[] c = {1};
                c[42] = 99; // выход за пределы масива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива " + e);
        }
    }

    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " +a);
            nesttry(a);
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль " + e);
        }
    }
}
