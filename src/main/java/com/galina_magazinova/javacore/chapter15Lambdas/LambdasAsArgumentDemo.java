package com.galina_magazinova.javacore.chapter15Lambdas;

public class LambdasAsArgumentDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Первоначальная строка " + inStr);

        //лямбда -> строка в верхний регистр
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре " + outStr);

        //лямбда - удаляет пробелы в строке
        outStr = stringOp((str) -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("Строка без пробелов " + outStr);

        //лямбда - строка с противоположным порядком следования
        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Строка Lambda  с противоположным порядком следования символов " + stringOp(reverse, inStr));
    }
}
