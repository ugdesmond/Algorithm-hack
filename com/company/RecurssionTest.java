package com.company;

public class RecurssionTest {
    public static void main (String [] args){
        int [] array =new int [] {2,4,5,6};

        int result = magicalLoop(array,0);
        System.out.println("====result===="+result);
    }


    public static  int magicalLoop(int [] array,int x){
        if(x == array.length)return 0;
       int magic = magicalLoop(array,x+1);

       return array[x]+ magic;
    }
}
