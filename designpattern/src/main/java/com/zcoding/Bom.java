package com.zcoding;

import java.util.Scanner;

/**
 * Bom 扫雷游戏 https://ac.nowcoder.com/acm/problem/16491
 */
public class Bom {

    public static void main(String[] args) {
        // String[][] in = { { "*", "?", "?" }, { "?", "?", "?" }, { "?", "*", "?" }, };
        // String[][] out = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
        int m = 0, n = 0;

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        String[][] in = new String[m][n];
        String[][] out = new String[m][n];

        String line = "";
        for (int i = 0; i < m; i++) {
            line = sc.nextLine();
            String[] ss = line.split("");
            if (ss.length == n) {
                for (int j = 0; j < n; j++) {
                    in[i][j] = ss[j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out[i][j] = getAroundBom(i, j, in);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(out[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

    // 计算周围的BOM
    public static String getAroundBom(int i, int j, String[][] ss) {
        if ("*".equals(ss[i][j])) {
            return "*";
        }
        int count = 0;
        int m = ss.length;
        int n = ss[1].length;
        if (0 <= i - 1 && "*".equals(ss[i - 1][j])) { // 上
            count++;
        }
        if (i + 1 < m && "*".equals(ss[i + 1][j])) { // 下
            count++;
        }
        if (0 <= j - 1 && "*".equals(ss[i][j - 1])) { // 左
            count++;
        }
        if (j + 1 < n && "*".equals(ss[i][j + 1])) { // 右
            count++;
        }
        if (0 <= i - 1 && 0 <= j - 1 && "*".equals(ss[i - 1][j - 1])) { // 左上
            count++;
        }
        if (0 <= i - 1 && j + 1 < n && "*".equals(ss[i - 1][j + 1])) { // 右上
            count++;
        }
        if (i + 1 < m && 0 <= j - 1 && "*".equals(ss[i + 1][j - 1])) { // 左下
            count++;
        }
        if (i + 1 < m && j + 1 < n && "*".equals(ss[i + 1][j + 1])) { // 右下
            count++;
        }
        return String.valueOf(count);
    }

}