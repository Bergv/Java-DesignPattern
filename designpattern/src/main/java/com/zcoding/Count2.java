package com.zcoding;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Count2 链接：https://ac.nowcoder.com/acm/problem/16538 来源：牛客网
 * 
 * 试计算在区间1 到n 的所有整数中，数字x（0 ≤ x ≤ 9）共出现了多少次？ 例如，在1到11
 * 中，即在1、2、3、4、5、6、7、8、9、10、11中，数字1 出现了4 次。 输入 11 1 输出 4
 */
public class Count2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        Pattern p = Pattern.compile(String.valueOf(k));
        Matcher m = null;
        // 解题1
        for (int i = 1; i <= n; i++) {
            m = p.matcher(String.valueOf(i));
            while (m.find()) {
                count++;
            }
        }

        // 解题2
        for (int i = 1; i <= n; i++) {
            int s = i;
            while (s > 0) {
                if (k == s % 10) {
                    count++;
                }
                s = s / 10;
            }
        }
        System.out.println(count);

        sc.close();
    }
}