package com.designpattern.chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
         * Random r = new Random(); int a = r.nextInt(1); System.out.println(a);
         * System.out.println(666); System.out.println();
         * 
         * String ss = "aaa"; ss = "ccc"; System.out.println(ss);
         */

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] aa = new int[5];
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(arr);
        for (int a : list2) {
            System.out.println(a);
            if (a == 3) {
                list2.add(99);
            }
        }

    }

}