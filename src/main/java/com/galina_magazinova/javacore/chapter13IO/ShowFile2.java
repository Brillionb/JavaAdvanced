package com.galina_magazinova.javacore.chapter13IO;

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("TEST.txt");

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char)i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {  // можно опустить и заменить одним IOException (ошибка ввода-вывода)
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
