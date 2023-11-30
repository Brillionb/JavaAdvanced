package com.galina_magazinova.javacore.chapter13IO;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
       char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Введите символы, для выхода введите q");

        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
