package com.galina_magazinova.javacore.chapter13IO;

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        String str;
        System.out.println("Вводите строки текста.");
        System.out.println("Для завершения введите stop.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
