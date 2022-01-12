package com.tosan.example3;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Example3 {
    // hashing
    // value -> hash -> hashedValue
    // 1- if 2 values are equals then their hashedValues have to be equaled
    // 2- if 2 values are not equals then their hashedValues dont have to be not equals
    // 3- ideal situation: 2 different values -> 2 different hashedValues
    // 4- if a value hashed more than once, all times hashedvalues are equals
    //      * in one run of Application
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.forEach(t -> System.out.println(t));
        Set<Deposit> set = new HashSet<>();
        Deposit deposit = new Deposit();
        deposit.setBalance(200);
        deposit.setDepositNumber("2");
        Deposit deposit1 = new Deposit();
        deposit1.setBalance(200);
        deposit1.setDepositNumber("2");
//        Customer customer = new Customer();
        if(deposit.equals(deposit1)){
            System.out.println("Deposits are equal");
        } else {
            System.out.println("Deposits are not  equal");
        }
    }
}
