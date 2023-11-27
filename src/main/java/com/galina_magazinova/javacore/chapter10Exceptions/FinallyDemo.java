package com.galina_magazinova.javacore.chapter10Exceptions;

public class FinallyDemo {

    static void procA(){
        try{
            System.out.println("В теле метода procA ");
            throw new RuntimeException("демонстрация");
            //System.out.println("этот текст не распечатается - ошибка");
        } finally {
            System.out.println("блок оператора finally в методе procA ");
        }
    }

    static void procB(){
        try{
            System.out.println("В теле метода procB ");
            return;
        }finally {
            System.out.println("блок оператора finally в методе procB ");
        }
    }

    static void procC(){
        try{
            System.out.println("В теле метода procC ");
        }finally {
            System.out.println("блок оператора finally в методе procC ");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Исключение из procA() перехвачено");
        }

        procB();
        procC();
    }
}
