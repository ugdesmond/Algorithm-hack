package com.company;

public class FactorialOfANumberAndFibonacci {
    public static void main (String args []){
        long value =recursionTest(4);
        System.out.println((Integer.MAX_VALUE+"===recursive call ==="+value));
    }
    public static int  getFactorial(int number){
       if(number!=0){
           return number*(getFactorial(number-1));}
       else{
           return 1;
       }

    }


    public static int  recursionTest(int number){
        if(number==0) return 1;
          int x =recursionTest(number-1);
          System.out.println(number+"=====x value===="+x);
       return x+4;

    }

//top down approach
    public static long  getFibonacciNumber(int n){
        long[] cache = new long [n+1];
        if(n<2) return n;
        if(cache[n] != 0) return cache[n];

        return cache[n]= getFibonacciNumber(n-1)+getFibonacciNumber(n-2);

    }

    //bottom up approach 1123
    public static long  getIterativeFibonacciNumber(int n){
        if(n ==0) return 0;
        if(n ==1) return 1;
        int[] cache = new int [n];
        cache[0]=1;
        cache[1]=1;
        for(int x =2; x< n;x++){
            cache[x]=cache[x-1] +cache[x-2];
        }
        return cache[n-1];
    }

}
