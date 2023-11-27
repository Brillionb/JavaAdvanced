package com.galina_magazinova.javacore.chapter10Exceptions;
// продемонстрировать цепочки исключений

public class ChainExDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("верхний уровень");// создать исключение
        e.initCause(new ArithmeticException("причина")); // добавить причину исключения
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("перехвачено исключение " + e);
            System.out.println("первопричина: " + e.getCause());
        }
    }
}
