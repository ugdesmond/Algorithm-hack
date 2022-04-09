package com.company;

public class LargestNumber {

        public static void main(String args[])
        {
            int[] a = new int[] { 20, 30, 50, 4, 71, 100};
            int index =getIndex(a);
            if(index== -1){
                System.out.println("No max single number");
                return;
            }
            int max = a[index];
            for(int i = 1; i < a.length;i++)
            {
                if(a[i]>9)
                    continue;
                if(a[i] > max )
                {
                    max = a[i];
                }
            }
            System.out.println("From The Array Element Largest Number is:" + max);

        }

        public static int getIndex(int num []){
              for(int x =0 ;x< num.length;x++){
                  if(num[x] <10){
                      return x;
                  }
              }
            return -1;
        }
     }
