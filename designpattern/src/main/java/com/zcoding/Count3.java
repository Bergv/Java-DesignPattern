package com.zcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Count2 链接：https://ac.nowcoder.com/acm/problem/16599 来源：牛客网
 * 
 * 题目描述 请统计某个给定范围[L, R]的所有整数中，数字2出现的次数。
 * 
 * 比如给定范围[2, 22]，数字2在数2中出现了1次，在数12中出现1次，在数20中出现1次，在数21中出现1次，
 * 
 * 在数22中出现2次，所以数字2在该范围内一共出现了6次。
 * 
 */
public class Count3 {

    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int c = 0;

        for (int i = l; i <= r; i++) {
            int n = i;
            while (n > 0) {
                if (2 == n % 10) {
                    c++;
                }
                n /= 10;
            }
        }

        System.out.println(c);

        sc.close();
    }
}