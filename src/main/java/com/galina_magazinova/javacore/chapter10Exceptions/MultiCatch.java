package com.galina_magazinova.javacore.chapter10Exceptions;
// демонстрация многократного перехвата

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try{
            // int result = a / b; // генерируется ArithmeticException
            vals[10] = 19; // генерируется IndexOutOfBoundsException
        }catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("Исключение перехвачено " + e);
        }
        System.out.println("После многократного перехвата");
    }
}
