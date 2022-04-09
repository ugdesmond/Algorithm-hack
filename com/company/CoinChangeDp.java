package com.company;
import java.util.*;
public class CoinChangeDp {
    public static void main(String [] args){
       int [] array  = {1,2,5};
      int result = new CoinChangeDp().coinChange(array,11);
      System.out.println("===="+result);
    }

    public int coinChange(int[] coins, int amount) {
     int [] dp = new int [1+amount];
         Arrays.fill(dp,amount+1);
         dp[0]=0;
         for(int x =0;x<=amount ;x++){
             for (int coin : coins) {
                 if (coin <= x) {
                     //one is added bc we are making use of the coin
                     dp[x] = Math.min(dp[x], 1 + dp[x - coin]);
                 }
             }
           }
     return dp[amount]>amount?-1 :dp[amount];
    }
}
