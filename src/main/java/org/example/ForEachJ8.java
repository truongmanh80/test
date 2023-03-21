package org.example;

import java.util.ArrayList;
import java.util.List;

public class ForEachJ8 {

    private static List<Integer> numbers1 = new ArrayList<>();
    private static List<Integer> numbers2 = new ArrayList<>();

    static {
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        numbers2.add(10);
        numbers2.add(11);
        numbers2.add(12);
    }
    public static void main(String[] args) {
        System.out.println("before addAll method");
        System.out.println("numbers1----------->");
        numbers1.forEach(System.out::println);
        System.out.println("numbers2----------->");
        numbers2.forEach(System.out::println);
        System.out.println("after addAll method");
        numbers1.addAll(numbers2);
        System.out.println("numbers1----------->");
        numbers1.forEach(System.out::println);
        System.out.println("numbers2----------->");
        numbers2.forEach(System.out::println);
    }
}
