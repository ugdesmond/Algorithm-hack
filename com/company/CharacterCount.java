package com.company;

public class CharacterCount {
    public static void main (String [] args){
        char s='w'; String values ="sassas";
        char [] ch= values.toCharArray();
        int count =0;
        for(Character c:ch ){
            if(c.equals(s)){
                count++;
            }
        }
        System.out.println("===count==="+count);
    }

}
