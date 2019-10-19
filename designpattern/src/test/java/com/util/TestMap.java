package com.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

/**
 * TestMap
 */
public class TestMap {

    @Test
    void tset() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            map.put(i, "err in " + i);
        }
        System.out.println(map.toString());
        map = map.entrySet().stream().filter(e -> (e.getKey() % 2 == 0))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        System.out.println(map.toString());
    }

    @Test
    void tset2() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            map.put(i, "err in " + i);
        }
        System.out.println(map.toString());
        map = map.entrySet().stream().filter(e -> filter(e))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        System.out.println(map.toString());
    }

    private boolean filter(Entry<Integer, String> e) {
        return true;
    }

    @Test
    void tset3() {
        System.out.println("c".compareTo("b"));
        Date d1 = new Date();
        SimpleDateFormat fomatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fomatter.format(d1));
    }

    @Test
    void tset4() {
        // a bb c d e
        System.out.println("a".compareTo("bb"));
        System.out.println("a".compareTo("abbbbbb"));
        System.out.println("bb".compareTo("c"));
        System.out.println("c".compareTo("d"));
        System.out.println("abcd".compareTo("abcdef"));
    }

    @Test
    void tset5() {
        String[] arr = { "bb", "d", "a", "c", "e" };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(666);
    }

    @Test
    void tset6() {
        String[] arr = { "bb", "d", "a", "c", "e" };
        int len = arr.length;
        while (len > 1) {
            if (arr[len - 1].compareTo(arr[len - 2]) < 0) {
                String larger = arr[len - 1];
                arr[len - 1] = arr[len - 2];
                arr[len - 2] = larger;
            }
            len--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(666);
    }

}