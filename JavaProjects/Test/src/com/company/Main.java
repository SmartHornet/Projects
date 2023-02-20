package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(5);
        intList.add(8);

        double sum = 0;
        for(int i : intList){
            sum = sum + i;
        }
        sum = sum/intList.size();

        System.out.print(sum);


    }
}
