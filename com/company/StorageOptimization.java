package com.company;

import java.util.List;

public class StorageOptimization {
    public static long storage(int n, int m, List<Integer> s, List<Integer> p) {
        int[] h = s.stream().mapToInt(i -> i).toArray();
        int[] v = p.stream().mapToInt(i -> i).toArray();

        boolean[] hc_missing = new boolean[n];
        boolean[] vc_missing = new boolean[m];
        for (int cut : h) hc_missing[cut - 1] = true;
        for (int cut : v) vc_missing[cut - 1] = true;
        int h_max = 0;
        for (int i = 0, j = 0; i < n; i++) {
            if (!hc_missing[i]) j = 0;
            else {
                j++;
                h_max = Math.max(h_max, j);
            }
        }
        int v_max = 0;
        for (int i = 0, j = 0; i < m; i++) {
            if (!vc_missing[i]) j = 0;
            else {
                j++;
                v_max = Math.max(v_max, j);
            }
        }
        return ((h_max + 1) * (v_max + 1)) % 1000000007;
    }

}
