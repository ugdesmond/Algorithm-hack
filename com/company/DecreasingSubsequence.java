package com.company;

import java.util.Arrays;
import java.util.List;

public class DecreasingSubsequence {

    private static int countDecreasingRatings(List<Integer> ratings){
        if (ratings == null || ratings.size() == 0) {
            return 0;
        }

        int[] dp = new int[ratings.size()];
        dp[0] = 1;

        for (int i = 1; i < ratings.size(); i++) {
            if (ratings.get(i) == ratings.get(i - 1) - 1) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
        }

        int res  = 0;
        for (int cur : dp) {
            res += cur;
        }
        return res;
    }



    public static void main (String  [] args){
        List<Integer> a = Arrays.asList(2,1,3);
        int count =countDecreasingRatings(a);
        System.out.println("=====total count ===="+count);
    }
}
