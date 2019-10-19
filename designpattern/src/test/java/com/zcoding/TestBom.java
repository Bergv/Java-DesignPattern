package com.zcoding;

import org.junit.jupiter.api.Test;

/**
 * TestBom
 */
public class TestBom {

    @Test
    public void test() {
        String[] ss = { "1", "2", "3" };
        System.out.println(666);
    }

    @Test
    public void test1() {
        String[][] in = { { "*", "?", "?" }, { "?", "?", "?" }, { "?", "*", "?" } };
        String[][] out = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
        System.out.println("666-----");

        int m = in.length;
        int n = in[1].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out[i][j] = Bom.getAroundBom(i, j, in);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println();
        }
    }
}