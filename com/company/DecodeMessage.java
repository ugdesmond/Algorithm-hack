package com.company;

public class DecodeMessage {
//To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
//"AAJF" with the grouping (1 1 10 6)
//"KJF" with the grouping (11 10 6)


    public static void main(String[] args) {
        String argValue = "226";
        int value = helper(argValue, argValue.length());
        System.out.println(value);

    }


    public static int helper(String data, int k) {
        if (k == 0) return 1;
        int s = data.length() - k;
        if (data.charAt(s) == '0') return 0;
        int result = helper(data, k - 1);
        if(s+1 < data.length()){
        String substringValue = data.substring(s, s + 2);
        if (k >= 2 && Integer.parseInt(substringValue) <= 26) {
            System.out.println(k+"===values==="+substringValue);
            result += helper(data, k - 2);
        }}
        return result;
    }
}
