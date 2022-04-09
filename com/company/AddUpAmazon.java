package com.company;

import java.util.Arrays;
import java.util.List;

public class AddUpAmazon {


    public static void main (String [] args ){
        //two sum
        int [] array = {6,1,6};
//        int ans = getDifferentCoinCombination(12, array);
//        Arrays.sort(array);
        int val = getTotalCount(array,12,array.length-1,"p");
    System.out.println("===total answer===="+val);
    }

//subarray...
    public static int getTotalCount (int array [],int total,int n,String initial){

        if(total==0) return 1;
        if(n <0) return 0;
        if(total <0) return 0;
        if(total < array[n]) return getTotalCount(array,total,n-1,"p");
        else{
            int totalX=getTotalCount(array,total-array[n],n-1,"x");
            System.out.println("====total count ===="+totalX);
            int totalY =getTotalCount(array,total,n-1,"y");
            System.out.println("====total count ===="+totalY);
            return totalX +totalY;
        }

    }
    //combinations
    public static int getDifferentCoinCombination (int n, int [] list){
        int [] dp = new int [n+1];
        dp[0]=1;
        for (int k : list) {
        for (int i = 1; i < dp.length; i++) {
                if (i - k >= 0) dp[i] += dp[i - k];

        }}
        return dp[n];
    }
}
