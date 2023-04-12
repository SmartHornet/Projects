package com.company.test;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

        System.out.println(hashMap.put(0,"Ноль"));
        System.out.println(hashMap.put(1,"Один"));
        System.out.println(hashMap.replace(1,"Один-2"));

        System.out.println(hashMap.containsKey(2));

        System.out.println(hashMap);




    }
}

