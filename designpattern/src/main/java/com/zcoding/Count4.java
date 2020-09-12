package com.zcoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 链接：https://ac.nowcoder.com/acm/problem/16585 来源：牛客网
 * 
 * 题目描述 一般的文本编辑器都有查找单词的功能，该功能可以快速定位特定单词在文章中的位置，有的还能统计出特定单词在文章中出现的次数。
 * 现在，请你编程实现这一功能，具体要求是：给定一个单词，请你输出它在给定的文章中出现的次数和第一次出现的位置。注意：匹配单词时，不区分大小写，但要求完全匹配，即给定单词必须与文章
 * 中的某一独立单词在不区分大小写的情况下完全相同（参见样例1 ），如果给定单词仅是文章中某一单词的一部分则不算匹配（参见样例2 ）
 */
public class Count4 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String w = br.readLine().toLowerCase();
        String l = br.readLine().toLowerCase();
        int c = 0;
        int index = 0;

        String[] ss = l.split(" ");
        for (int i = 0; i < ss.length; i++) {
            if (w.equals(ss[i])) {
                c++;
            }
            if (c < 1) {
                index += ss[i].length() + 1;
            }
        }

        if (c > 0) {
            System.out.println(c + " " + index);
        } else {
            System.out.println("-1");
        }

        sc.close();
    }

    void get2() {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine().toLowerCase();
        String s = in.nextLine().toLowerCase();
        int c = 0;
        int index = 0;
        int flag = 0;
        String sc[] = s.split(" ");
        for (int i = 0; i < sc.length; i++) {
            if (sc[i].equals(t))
                c++;
            if (c == 1)
                flag = 1;
            if (flag == 0)
                index += sc[i].length() + 1;
        }
        if (c == 0) {
            System.out.println("-1");
        } else {
            System.out.println(c + " " + index);
        }
    }
}