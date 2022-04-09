package com.company;

public class BubbleSort {
   public static void main (String args []){

   }

    private void bubbleSort(int [] array){

       int n = array.length;
       int tmp=0;
       for(int i=0;i<n;i++){
           for(int j =1; j <(n-i); j++){
            if(array[j-1] > array[j]){
                tmp = array[j-1];
                array[j-1] =  array[j];
                array[j] =tmp;
            }


           }
       }

    }
}
