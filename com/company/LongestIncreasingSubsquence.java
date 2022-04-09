package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestIncreasingSubsquence {
    static int findLIS(int[] s) {


        int max = 1;
        int initialKey=0;
        int initialVal=0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(initialKey,initialVal);
        Map<Integer, Integer> count = new HashMap<>();
        for(int a : s) {
            int floor = treeMap.floorKey(a - 1);
            int c = treeMap.get(floor);
            int nc = c + 1;
            if(count.containsKey(nc)) {
                int old = count.get(nc);
                treeMap.remove(old);
            }

            if(nc > max) {
                max = nc;
            }
            treeMap.put(a, nc);
            count.put(nc, a);
        }

        return max;
    }
}
