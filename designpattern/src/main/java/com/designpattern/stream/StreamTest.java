package com.designpattern.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("-----------------");
        doSome6();
    }

    private static void doSome() {
        IntStream.range(2, 100).filter(n -> {
            System.out.print(n + " --> ");
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (!(n % j > 0)) {
                    System.out.println();
                    return false;
                }
            }
            return true;
        }).forEach(System.out::println);
    }

    private static void doSome2() {
        IntStream.range(2, 100).forEach(n -> {
            System.out.print(n + " --> ");
            boolean f = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (!(n % j > 0)) {
                    f = false;
                    System.out.println();
                    break;
                }
            }
            if (f)
                System.out.println(n);
        });
    }
    
    private static void doSome3() {
        IntStream.range(2, 100).forEach(n -> {
            System.out.print(n + " --> ");
            System.out.println(IntStream.range(2, (int) Math.sqrt(n)).allMatch(i -> {
                System.out.print("i= " + i + " --> ");
                return (n % i > 0);
            }));

        });
    }

    private static void doSome31() {
        IntStream.range(2, 100).forEach(n -> {
            System.out.print(n + " --> ");
            IntStream.range(2, (int) Math.sqrt(n)).forEach(i -> {
                System.out.print("i= " + i + " --> ");
                // return (n % i > 0);
            });
            System.out.println();
        });
    }

    private static void doSome4() {
        int n = 13;
        System.out.print(n + " --> ");
        System.out.println(IntStream.range(2, (int) Math.sqrt(n)).allMatch(i -> {
            System.out.println("i --> " + i );
            return (n % i > 0);
        }));
    }
    
    private static void doSome5() {
        Arrays.asList("ac", "acs", "ax", "axx", "add").stream().allMatch(s -> {
            boolean f = s.startsWith("a");
            System.out.println(s + " --> " + f);
            return f;
        });
    }
    
    private static void doSome6() {
        IntStream.range(2, 100).filter(n -> {
            System.out.print(n + " --> ");
            boolean f = IntStream.range(2, (int) Math.sqrt(n)).allMatch(i -> {
                boolean f1 = (n % i > 0);
                System.out.print(" i = " + i + " -> " + f1);
                if (!f1) {
                    System.out.println();
                }
                return f1;
            });
            System.out.println("n = " + n + " --> " + f);
            return f;
        }).sum();
    }
    
    private static void doSome92() {
        IntStream.range(2, 100).filter(n -> {
            return IntStream.range(2, (int)Math.sqrt(n)).allMatch(i -> (n % i > 0));
        }).forEach(System.out::println);
    }
}
