package com.zcoding;

/**
 * NtoM
 */
public class NtoM {

    public static void main(String[] args) {
        fun(0.795, 5);
        fun(0.795, 3);
    }

    private static void fun(double d, int n) {
        if (d >= 1 || n <= 1) {
            return;
        }
        int save = 10; // 保留10位
        int[] res = new int[save];
        StringBuilder sb = new StringBuilder("0.");
        for (int i = 0; i < save; i++) {
            d *= n;
            res[i] = (int) d;
            if (d >= 1.0) {
                d -= res[i];
            }
            sb.append(res[i]);
        }
        System.out.println(sb.toString());
    }
}