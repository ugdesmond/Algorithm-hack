package com.company;

import com.google.gson.Gson;

import java.util.HashMap;

public class JavaAscending {
    public static void main (String args []){
        int n [] ={1,2,3,-1,4};
        ascendFinally(n);
        System.out.println("ans =========="+ new Gson().toJson(n));


}
   public static int getVal(){
       int n [] ={1,2,3,-1,4};
       for (int k : n) {
           for (int i : n) {
               if (k == -i)
                   return k;
           }
       }
    return 0;
   }
   public static  int getMaxValue (){
       int array [] ={1,2,3,-1,4};
       HashMap<Integer,Integer> hashMap= new HashMap<>();
       for(int i =0; i< array.length;i++){
           int arrayValue = array[i];
           if(hashMap.containsKey(Math.abs(arrayValue))){
               int firstIndex =hashMap.get(Math.abs(arrayValue));
               int secondIndex = i;
               if(array[firstIndex]+array[secondIndex]==0){
                   return Math.abs(arrayValue);
               }
           }else{
               if(arrayValue!=0){
               hashMap.put(Math.abs(arrayValue),i);}
           }
       }
       return 0;
   }


   public static void ascendFinally(int[] val){


        for(int i=0; i < val.length; i++){
            for(int x=i+1; x < val.length; x++){
             int  temp=val[i];
               int k = val[i];
               int j=val[x];
               if(k > j){
                   val[i]=j;
                   val[x]=temp;
               }
            }
        }


   }

}