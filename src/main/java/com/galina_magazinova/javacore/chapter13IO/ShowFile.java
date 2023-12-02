package com.galina_magazinova.javacore.chapter13IO;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        /*if(args.length!=1){
            System.out.println("Использование: ShowFile имя-файла");
            return;
        }*/


        try {
            //fin = new FileInputStream(args[0]);
            fin = new FileInputStream("TEST.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла. ");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
