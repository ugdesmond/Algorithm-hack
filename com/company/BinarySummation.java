package com.company;

public class BinarySummation {
    public static void main (String args []){
        String result = addBinary("100","11");
        System.out.println(result);
        testCharToIntConversiont('1');
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aLength =a.length()-1;
        int bLength=b.length()-1;
        int carry =0;
        while(aLength >=0 || bLength >=0){
            int sum=carry;
            if(aLength >=0) sum+= a.charAt(aLength)-'0';
            if(bLength >=0) sum+=b.charAt(bLength)-'0';
            sb.append(sum%2);
            carry=sum/2;
            --aLength;
            --bLength;
        }
        if(carry !=0) sb.append(carry);
        return sb.reverse().toString();
    }


    public static void testCharToIntConversiont(char s){
        int x = 1-'0';
        System.out.println(s);
    }
}
