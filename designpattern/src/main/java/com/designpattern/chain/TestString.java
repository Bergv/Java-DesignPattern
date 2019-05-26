package com.designpattern.chain;

/**
 * TestString
 */
public class TestString {

    public static void main(String[] args) {
        String a = "abcdefghijklmnopq";
        String b = "asdanfgh";

        a.split(" ");

        String c = getString(a, b);
        System.out.println(c);

    }

    public static String getString(String a, String b) {
        if (a == null || a.isEmpty()) {
            return a;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }

        String[] ss = a.split("");
        int len = ss.length;
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            if (!b.contains(ss[i])) {
                sb.append(ss[i]);
            }
        }
        return sb.toString();
    }
}