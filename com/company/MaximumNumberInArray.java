package com.company;

public class MaximumNumberInArray {
    public static void main (String [] args){
        int [] array = {9,2,3,4,5,6};
        int max =0;
        for(int x =0;x< array.length; x++){
          if(x==0) max=array[x];
          if(array[x] >max){ max=array[x];}
        }
        System.out.println("====max===="+max);
    }
}
