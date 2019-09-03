package com.util;

import java.text.SimpleDateFormat;
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
        Date d1 = new Date();
        SimpleDateFormat fomatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fomatter.format(d1));
    }

}