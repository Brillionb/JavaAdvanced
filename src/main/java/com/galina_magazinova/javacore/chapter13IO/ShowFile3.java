package com.galina_magazinova.javacore.chapter13IO;

//try with resources

import java.io.*;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;
        try (FileInputStream fin = new FileInputStream("TEST.txt")) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}
