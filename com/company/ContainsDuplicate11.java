package com.company;

import java.util.HashMap;

public class ContainsDuplicate11 {
    //Given an array of integers, find out whether there are two distinct indices i and j
    // in the array such that the absolute difference
    //  the absolute difference between i and j is at most m.
    public static void main (String  []args){
        int [] valueArray ={1,2,3,1};
        boolean result = containsNearbyDuplicate(valueArray,2);
        System.out.println("result ==="+result);
    }
   public static boolean containsNearbyDuplicate(int [] array,int m){
       HashMap<Integer,Integer>  hashMap= new HashMap<>();
        for(int i =0; i< array.length;i++){
            int arrayValue = array[i];
            if(hashMap.containsKey(arrayValue) && i-hashMap.get(arrayValue) <= m){
                return true;
            }else{
                hashMap.put(arrayValue,i);
            }
        }
        return false;
   }
}
