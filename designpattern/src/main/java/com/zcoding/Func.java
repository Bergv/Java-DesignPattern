package com.zcoding;

import java.util.Scanner;

/**
 * Func
 */
public class Func {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String l = sc.nextLine();

        int n = 3;
        String l = "-50 0 0 1";

        String s = "";
        String t = "";
        String[] ss = l.split(" ");
        for (int i = 0; i < ss.length; i++) {
            if ("0".equals(ss[i])) {
                continue;
            }
            if (n - i > 0) {
                if (Integer.parseInt(ss[i]) < 0) {
                    if (Integer.parseInt(ss[i]) == -1) {
                        t = "-";
                        s += t + "x^" + String.valueOf(n - i);
                    } else {
                        t = ss[i];
                        s += t + "x^" + String.valueOf(n - i);
                    }
                } else {
                    if (Integer.parseInt(ss[i]) == 1) {
                        t = "+";
                        s += t + "x^" + String.valueOf(n - i);
                    } else {
                        t = "+" + ss[i];
                        s += t + "x^" + String.valueOf(n - i);
                    }
                }
            }
            if (n - i == 0) {
                if (Integer.parseInt(ss[i]) < 0) {
                    s += "-" + ss[i];
                } else {
                    s += "+" + ss[i];
                }
            }
        }
        if (s.startsWith("+")) {
            s = s.substring(1);
        }
        System.out.println(s);
    }
}