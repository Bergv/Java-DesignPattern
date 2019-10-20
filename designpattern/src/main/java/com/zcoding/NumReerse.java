package com.zcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * NumReerse 链接：https://ac.nowcoder.com/acm/problem/16584 来源：牛客网 题目描述
 * 给定一个整数，请将该数各个位上数字反转得到一个新数。新数也应满足整数的常见形式，即除非给定的原数为零，否则反转后得到的新数的最高位数字不应为零（参见样例2）。
 */
public class NumReerse {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        // 解题1
        String num = "";
        if (in >= 0) {
            num = new StringBuilder(String.valueOf(in)).reverse().toString();
        } else {
            num = "-" + new StringBuilder(String.valueOf(-in)).reverse().toString();
        }
        System.out.println(Integer.parseInt(num));

        // 解题2
        int n = in = Integer.parseInt(br.readLine());
        ;
        int s = 0;
        while (n != 0) {
            s = s * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(s);
        sc.close();
    }
}