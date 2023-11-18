package main.java.com.galina_magazinova.javacore.chapter18;

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
    }
}
