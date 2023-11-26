package com.galina_magazinova.javacore.chapter10Exceptions;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch(Exception e){
            System.out.println("Перехват исключений общего класса Exception " + e);
        }// catch (ArithmeticException e){
          //  System.out.println("Ошибка, этот код никогда не будет достижим");
        //}
    }
}
