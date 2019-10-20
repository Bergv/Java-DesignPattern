package com.zcoding;

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
    }

    @Test
    public void testx() {
        String s = "to be or not to be is a question";
        System.out.println(s.indexOf("to"));
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
}