package com.galina_magazinova.javacore.chapter13IO;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Текстовая строка");
        int i = -7;
        pw.println(i);
        double d = 4.5E-7;
        pw.println(d);
    }
}
