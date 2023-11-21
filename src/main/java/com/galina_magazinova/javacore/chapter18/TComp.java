package main.java.com.galina_magazinova.javacore.chapter18;
//использование компаратора для сортировки счетов по фамилии владельца

import java.util.*;

// сравнивает последние полные слова в двух строках
public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // найти индекс начала фамилий
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // фамилии совпадают, проверить полное имя
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }
    // переопределять equals() не нужно
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        // создать tree map
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // поместить элементы в map
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // получить набор элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // отобразить элементы
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // пополнить счет клиента John Doe на 1000
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}

