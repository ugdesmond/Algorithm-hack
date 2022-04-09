package com.company;

public class LongestPalidromicSubstring {

    public static void main (String args []){
        String stringExample = "babad";
        int start =0;
        int end =0;
        for(int x=0;x<stringExample.length();x++){
            //this handles where the middle numbers are not the same example
            // "testing" picking a point at 2..which is 's', s==s
            int len1 = expandFromMiddle(stringExample,x,x);
            //this condition handles where the value at x and x+1 are equal.
            int len2 =expandFromMiddle(stringExample,x,x+1);
            int maxPalidromeLength =Math.max(len1,len2);
            if(maxPalidromeLength > end-start){
                start= x-(maxPalidromeLength-1)/2 ;
                end = x+(maxPalidromeLength/2);
            }

        }
        System.out.println((stringExample.substring(start,(end+1))));

    }

    //Expand round corner
    public static int expandFromMiddle (String s,int left,int right){
        if(s==null || left > right) return 0;
        while(left >= 0 && right <s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
