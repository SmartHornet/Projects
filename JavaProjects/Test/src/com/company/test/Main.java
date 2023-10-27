package com.company.test;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        /*HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

        System.out.println(hashMap.put(0,"Ноль"));
        System.out.println(hashMap.put(1,"Один"));
        System.out.println(hashMap.replace(1,"Один-2"));

        System.out.println(hashMap.containsKey(2));

        System.out.println(hashMap);*/


        /*Double d1 = Double.valueOf(1/0.);
        Double d2 = Double.valueOf(0/0.);

        double d3 = 0.;

        System.out.println(d1.isInfinite());
        System.out.println(d1.isNaN());
        System.out.println(d2.isInfinite());
        System.out.println(d2.isNaN());

        System.out.println(d3);*/

        //System.out.println(Boolean.parseBoolean("TrUe"));

        /*Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
        }catch (Exception e){
            System.out.print("Ошибка");
        }*/

        double d = ((System.currentTimeMillis()/1000)/60/60/24) / 366 ;
        System.out.print(d);

    }
}

