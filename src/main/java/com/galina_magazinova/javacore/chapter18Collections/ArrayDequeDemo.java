package com.galina_magazinova.javacore.chapter18Collections;
// Демонстрация использования ArrayDeque

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать ArrayDeque
        ArrayDeque<String> adq = new ArrayDeque<>();

        // использовать экземпляр ArrayDeque подобно стеку
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Извлечение из стека: ");
        while(adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
