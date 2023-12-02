package com.galina_magazinova.javacore.chapter13IO;
// try with resources

import java.io.*;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        int i;
/*
        if (args.length != 2) {
            System.out.println("Использование: CopyFile исходный-файл целевой-файл");
            return;
        }*/

        try (FileInputStream fin = new FileInputStream("TEST.txt");
             FileOutputStream fout = new FileOutputStream("TEST2.txt")) {
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
