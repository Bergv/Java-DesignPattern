package com.designpattern.io.zip;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * TestZip
 */
public class TestZip {

    @Test
    void test() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("------1-------");
        System.out.println(list.get(0));

        System.out.println("------2-------");
        String remove = list.remove(0);
        System.out.println(list.get(0));
        System.out.println(remove + " ------3-------");
        System.out.println(list.get(0));
        // fail("Not yet implemented");
        assertFalse(false);
    }
}