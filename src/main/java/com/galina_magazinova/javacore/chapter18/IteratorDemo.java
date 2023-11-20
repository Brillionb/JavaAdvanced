package main.java.com.galina_magazinova.javacore.chapter18;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        // создать ArrayList
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // используем итератор для отображения содержимого al
        System.out.print("Исходное содержимое al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // модифицировать объекты в ходе итерации
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Модифицированное содержимое al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // отобразить список в обратном порядке/ указатель сейчас на конце списка
        System.out.println("Модифицированный список в обратном порядке: ");
        while(litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
