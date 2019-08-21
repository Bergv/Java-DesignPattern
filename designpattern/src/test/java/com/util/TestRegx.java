package com.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * TestRegx
 */
public class TestRegx {

    @Test
    void test1() {
        String fun = "dMAC_1111111111";
        String regex = "^dMAC_.*";

        boolean matches = Pattern.matches(regex, fun);
        System.out.println(matches);

        // String content = "I am noob from runoob.com.";
        // String pattern = ".*runoob.*";

        // boolean isMatch = Pattern.matches(pattern, content);
        // System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        // assertFalse(matches);
        assertTrue(matches);
    }

    @Test
    void test1x() {
        String fun = "MACassdsapp";
        String regex = ".*app$";

        boolean matches = Pattern.matches(regex, fun);
        System.out.println(matches);

        // String content = "I am noob from runoob.com.";
        // String pattern = ".*runoob.*";

        // boolean isMatch = Pattern.matches(pattern, content);
        // System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        // assertFalse(matches);
        assertTrue(matches);
    }

    @Test
    void test1xz() {
        String fun = "MACassdsapp";
        String regex = "^.*";

        boolean matches = Pattern.matches(regex, fun);
        System.out.println(matches);

        // String content = "I am noob from runoob.com.";
        // String pattern = ".*runoob.*";

        // boolean isMatch = Pattern.matches(pattern, content);
        // System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        // assertFalse(matches);
        assertTrue(matches);
    }

    @Test
    void test111() {
        String fun = "dMAC_OPCCC";
        String regex = "dMAC_*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fun);

        while (m.find()) {
            System.out.println(m.group() + "   位置：[" + m.start() + "," + m.end() + "]");
        }

        assertFalse(false);
        // assertTrue(matches);
    }

    @Test
    void test1c() {
        String fun = "dMAC_OPCCC";
        String filter = "dMAC_*";
        String regex = "dMAC_";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fun);

        System.out.println(m.matches());
        // System.out.println(m.start());
        // while (m.find()) {
        // System.out.println(m.group() + " 位置：[" + m.start() + "," + m.end() + "]");
        // }

        assertFalse(false);
        // assertTrue(matches);
    }

    @Test
    void test11c() {
        String fun = "hello_AbcOtt";
        String filter = "dMAC_*";
        String regex = "^hello.*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fun);

        System.out.println(m.matches());
        // System.out.println(m.start());
        // while (m.find()) {
        // System.out.println(m.group() + " 位置：[" + m.start() + "," + m.end() + "]");
        // }

        assertFalse(false);
        // assertTrue(matches);
    }

    @Test
    void test2() {
        String fun = "dMAC_OperateTimer";
        String regex = "dMAC_*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fun);
        boolean f = m.find();
        boolean f2 = m.find(1);

        System.out.println(f);
        System.out.println(f2);
        // assertFalse(matches);
        // assertTrue(matches);
    }

    @Test
    void test3() {
        String str = "hello world,hello java,hello java";

        System.out.println("===========匹配字符串===========");
        // 匹配str中所有字符串hello，这时str中3个hello都能匹配上，通过下面打印的匹配上的字符串的位置可以看出
        Pattern p = Pattern.compile("hello");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group() + "   位置：[" + m.start() + "," + m.end() + "]");
        }

        // System.out.println(f);
        // System.out.println(f2);
        // assertFalse(matches);
        // assertTrue(matches);
        assertTrue(true);
    }
}