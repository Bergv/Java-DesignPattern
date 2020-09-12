package com.zcoding;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * TestSum
 */
public class TestSum {

    @Test
    public void test() {
        String s = "asdsadsagfd";
        System.out.println(s.indexOf(""));
        System.out.println(s.split(" ")[1]);
        System.out.println(Math.ceil(-10.1));
    }

    @Test
    public void testa() {
        String s = "1234\n";
        System.out.println(s);
        System.out.println(s.length());
        // System.out.println(s.indexOf);
    }

    @Test
    public void testx() {
        String s = "to be or not to be is a question";
        System.out.println(s.indexOf("to"));
    }

    @Test
    public void testxx() {
        BigDecimal d = new BigDecimal("0.1999");
        System.out.println(d.toString());
    }

    @Test
    public void test1() {
        int temp = 285;
        int count = 0;
        while (temp >= 10) {
            temp = Integer.parseInt(Stream.of((temp + "").split("")).reduce((a, b) -> {
                return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
            }).get());
            count++;
        }
        System.out.println(count);
    }

    @Test
    public void test2() {

        System.out.println(-1234 % 10);
        System.out.println(-1234 / 10);
    }

    @Test
    public void test3() {
        BigInteger a = new BigInteger("87", 9);
        BigInteger b = new BigInteger("78", 9);
        System.out.println(a.toString(16));
        System.out.println(a.add(b));
    }

    @Test
    public void test4() {
        String t = "To".toLowerCase();
        String s = "cca aa to be or not to be is a question".toLowerCase();
        int c = 0;
        int index = 0;
        int flag = 0;
        String ss[] = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(t))
                c++;
            if (c == 1)
                flag = 1;
            if (flag == 0)
                index += ss[i].length() + 1;
        }

        index = s.indexOf(t.charAt(0));
        if (c == 0) {
            System.out.println("-1");
        } else {
            System.out.println(c + " " + index);
        }
    }
}