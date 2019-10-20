package com.zcoding;

import java.util.Scanner;

/**
 * DeleteString 删除重复字符
 * https://www.nowcoder.com/questionTerminal/6a347956dcbf468992d0d349c6fade4b
 */
public class DeleteString2 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String l = sc.nextLine();
        String l = "banana";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l.length(); i++) {
            if (-1 == sb.indexOf(l.charAt(i) + "")) {
                sb.append(l.charAt(i));
            }
        }

        System.out.println(sb.toString());

        // sc.close();
    }
}