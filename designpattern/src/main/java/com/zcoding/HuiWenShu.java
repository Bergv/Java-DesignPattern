package com.zcoding;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * HuiWenShu 链接：https://ac.nowcoder.com/acm/problem/16786 来源：牛客网
 * 
 * 题目描述 若一个数（首位不为零）从左向右读与从右向左读都一样，我们就将其称之为回文数。
 * 
 * 例如：给定一个10进制数56，将56加56（即把56从右向左读），得到121是一个回文数。
 * 
 * 又如：对于10进制数87： STEP1：87+78 = 165 STEP2：165+561 = 726
 * 
 * STEP3：726+627 = 1353 STEP4：1353+3531 = 4884
 * 
 * 在这里的一步是指进行了一次N进制的加法，上例最少用了4步得到回文数4884。
 * 
 * 写一个程序，给定一个N（2<=N<=10，N=16）进制数M，求最少经过几步可以得到回文数。
 * 
 * 如果在30步以内（包含30步）不可能得到回文数，则输出“Impossible！”
 */
public class HuiWenShu {

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        boolean flag = false;

        for (int i = 1; i <= 30; i++) {
            String ss = reverse(s);
            if (i == 1 && s.equals(ss)) {
                count = 0;
                flag = true;
                break;
            }
            BigInteger a = new BigInteger(s, n);
            BigInteger b = new BigInteger(ss, n);
            a = a.add(b);
            String c = a.toString(n);
            if (c.equals(reverse(c))) {
                count = i;
                flag = true;
                break;
            }
            s = c;
        }

        if (flag) {
            System.out.println("STEP=" + count);
        } else {
            System.out.println("Impossible!");
        }

    }
}