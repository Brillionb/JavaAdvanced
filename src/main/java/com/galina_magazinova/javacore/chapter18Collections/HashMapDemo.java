package com.galina_magazinova.javacore.chapter18Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        //создать HashMap
        HashMap<String, Double> hm = new HashMap<>();

        //поместить элементы в HashMap
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // получить набор элементов
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // отобразить содержимое HashMap
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // пополнить счет клиента John Doe на 1000
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("Новый баланс клиента John Doe: " + hm.get("John Doe"));
    }
}
