package com.galina_magazinova.javacore.chapter10Exceptions;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne() ");
        throw new IllegalAccessException("Демонстрация ");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        } catch (IllegalAccessException e){
            System.out.println("Перехвачено исключение " + e);
        }
    }
}
