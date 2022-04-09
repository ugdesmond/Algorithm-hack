package com.company;

public class MathPower {
    public static void main (String [] args){
      int number =10; int power = 18;
      long total=1;
      while(power>0){
          total*=number;
          power--;
      }
      System.out.println("===power value==="+total);
    }
}
