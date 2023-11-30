package com.galina_magazinova.javacore.chapter13IO;
// чтение строк выполняется до 100 строк или до момента ввода stop

import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        String[] str = new String[100];
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }

        System.out.println("\nВот то, что вы ввели:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
