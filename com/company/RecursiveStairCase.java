package com.company;

import java.util.ArrayList;
import java.util.List;

public class RecursiveStairCase {
    public static void main (String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        //Given a starcase with number 5,find how many ways it can be climbed using the following steps {1,3,4}
        // for the staircase ..using recursion and when the base case for o and 1==1;
        int ans = processStairCaseRecursive(12,list);
        System.out.println("======result====="+ans);

    }



    public static int processStairCaseRecursive (int n,List<Integer> list){
       int [] dp = new int [n+1];
       dp[0]=1;
       for(int i =1;i<= n;i++){
           for (Integer integer : list) {
                   if (i - integer >= 0) dp[i] += dp[i - integer];
           }
       }

        return dp[n];
    }


}
