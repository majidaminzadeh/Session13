package com.tosan.example2;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        System.out.println(list.size());
        System.out.println("Index 2 of list is " + list.get(2));
    }
}
