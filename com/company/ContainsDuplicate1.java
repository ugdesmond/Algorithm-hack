package com.company;

import java.util.HashSet;

public class ContainsDuplicate1 {
    public static void main(String [] args){
        int [] array  ={0,0,4,6,7,1};
        boolean result  = checkIfArrayContainsDuplicate(array);
        System.out.println("=======result===="+result);

    }
    public static  boolean checkIfArrayContainsDuplicate(int  [] array){
        HashSet<Integer> set = new HashSet<>();
        for(int i :array){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }

        }
        return false;
    }
}
