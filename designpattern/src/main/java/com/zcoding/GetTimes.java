package com.zcoding;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * GetTimes 牛客网 变换次数
 * https://www.nowcoder.com/questionTerminal/8c38063ca1574d93960c761f8f6efc81?orderByHotValue=1&commentTags=JavaScript
 */
public class GetTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int times = 0;
        while (sc.hasNext()) {
            base = sc.nextInt();
        }

        while (base >= 10) {
            base = getBase(base);
            times++;
        }
        System.out.println(times);
    }

    private static int getBase(int base) {
        int temp = base;
        int b = 1;
        int t;
        while (temp > 0) {
            t = temp % 10;
            if (t == 0) {
                return 0;
            }
            b = b * t;
            temp = temp / 10;
        }
        return b;
    }

    private static int getT(int base) {
        int temp = base;
        int count = 0;
        while (temp >= 10) {
            temp = Integer.parseInt(Stream.of((temp + "").split("")).reduce((a, b) -> {
                return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
            }).get());
            count++;
        }
        return count;
    }

}