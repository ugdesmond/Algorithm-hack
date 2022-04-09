package com.company;

public class FirstNonRepeatingCharacter {
    public static void main(String [] args){

    }
    public int firstUniqChar(String s) {
        for(int x =0;x< s.length();x++){
            if(s.indexOf( s.charAt(x)) == s.lastIndexOf(s.charAt(x))  )return x;
        }
        return -1;
    }
}
