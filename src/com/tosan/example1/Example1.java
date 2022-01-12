package com.tosan.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Example1 {
    // input N entry
    // process??
    //  1- constant order O(c)
    //  2- O(1)
    //  3- O(N) <- O(2N), O(3N + 5)
    //  4- O(x^N) // x is a number
    //  5- O(N^x) // x is a number ,<- O(N^3 + N^2)
    //  6- O(logN)
    public static void main(String[] args) {
        String[] stringArray = new String[10];
//        stringArray[11] = "";
//        System.out.println(stringArray.length);
        List<String> list = new ArrayList<>(); // String[] list = new String[10];
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
        list.add("11"); // 1- String[] list = new String[??]; 2-copy all strings to new array 3-add new entry
        System.out.println(list.get(3));
        List<String> listWithInitSize = new ArrayList<>(100); // ArrayList with initialized capacity

    }
}
