package com.zcoding;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/**
 * TestSum
 */
public class TestSum {

    @Test
    public void test() {
        String[] ss = { "1", "2", "3" };
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
}