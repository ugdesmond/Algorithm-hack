package com.company;

import java.util.Collections;

public class TestPalindrome {


    public static void main(String[] args) {
      boolean result  = checkIfPalindrome("mam");
      System.out.println("=====final result===="+result);
    }


    public static boolean checkIfPalindrome(String val) {
        String ansResult = reverseString(val);
        return (val.equals(ansResult));
    }

    public static String reverseString(String stringVal) {

        if (stringVal.equals("")) return "";
        return reverseString(stringVal.substring(1)) + stringVal.charAt(0);
    }
}
