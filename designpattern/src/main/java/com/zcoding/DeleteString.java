package com.zcoding;

import java.util.Scanner;

/**
 * DeleteString 删除公共字符
 * https://www.nowcoder.com/questionTerminal/f0db4c36573d459cae44ac90b90c6212?orderByHotValue=0&page=1&onlyReference=false
 * 
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are
 * students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 */
public class DeleteString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        String w = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        String[] ss = l.split(" ");

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                if (!w.contains(ss[i].charAt(j) + "")) {
                    sb.append(ss[i].charAt(j));
                }
            }
            if (i < ss.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());

        sc.close();
    }
}