package com.company;



import com.google.gson.Gson;

import java.util.*;

public class SherLockAndValidString {
//    Sherlock considers a string to be valid if all characters of the string
//    appear the same number of times. It is also valid if he can remove just
//    character at  index in the string, and the remaining characters will occur the same number of times
    static Gson gson= new Gson();
    public static void main (String args []){
     String answer =   isValid("abcdefghhgfedecba");
     System.out.println("answer====="+answer);
    }

    static String isValid(String str) {
        if(str == null || str.isEmpty()) {
            return "YES";
        }

        Map<Character,Integer> map = new HashMap<>();

        // Run loop form 0 to length of string
        for(int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println("===hasmap====="+gson.toJson(map));
        Iterator<Integer> itr = map.values().iterator();

        // declaration of variables
        boolean first = true, second = true;
        int val1 = 0, val2 = 0;
        int countOfVal1 = 0, countOfVal2 = 0;

        while(itr.hasNext()) {
            int i = itr.next();

            // if first is true than countOfVal1 increase
            if(first) {
                val1 = i;
                first = false;
                countOfVal1++;
                continue;
            }

            if(i == val1) {
                countOfVal1++;
                continue;
            }

            // if second is true than countOfVal2 increase
            if(second) {
                val2 = i;
                countOfVal2++;
                second = false;
                continue;
            }

            if(i == val2) {
                countOfVal2++;
                continue;
            }

            return "NO";
        }

        if(countOfVal1 > 1 && countOfVal2 > 1) {
            return "NO";
        }else {
            return "YES";
        }
    }

}
