package com.company;

import com.google.gson.Gson;

public class ReverseArray {
    public static void main (String [] args){
        int [] testArray =  {2,4,5,6,7};
        int [] array= new int[testArray.length];
        int count =0;
        for(int x =testArray.length; x>0; x--){
            array[count++] =testArray[x-1];

        }
        System.out.println("array"+ new Gson().toJson(array));
    }
}
