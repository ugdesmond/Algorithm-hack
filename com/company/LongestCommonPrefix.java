package com.company;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//    Example 1:
//
//    Input: ["flower","flow","flight"]
//    Output: "fl"
    public static void main (String arg []){
        String test ="akkf akkf";
       String ans= getLongestPrefix(test);
       System.out.println(" value ans "+ans);
    }



    public static String FirstReverse(String str) {
        String []  strArray=str.split(" ");
        String result =" ";
        String concatVal =" ";
        for(int x =strArray.length -1; x>=0; x--){
            String resultVal =reverseString(strArray[x]);
            result=result+resultVal+concatVal;
            System.out.println("===value===  "+result);
        }
        return str.trim();
    }

    public static String reverseString (String str){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        strBuilder.reverse();

        return strBuilder.toString();
    }

    public static String getLongestPrefix (String str){
        String []  strArray=str.split(" ");
        String [] mainArray = sortedArrayByLength(strArray);
        String firstElement = mainArray[0];
        int y = 0;

        for(int x=0; x<firstElement.length();x++){
            String check =firstElement.substring(0,x+1);
            for(int j=0; j<mainArray.length;j++){
                String  valSub =mainArray[j].substring(0,x+1);
                if(!check.equals(valSub) &&  x == 0 ) {
                    return "";
                }else if(!check.equals(valSub) && x !=0 ){
                 return firstElement.substring(0,x);
                }
            }
          y=y+1;
        }
return firstElement.substring(0,y);


    }


    public static String [] sortedArrayByLength(String [] array){
        String [] nArray = new String[array.length];
        int index =0;
        int currentLength=0;
       for(int i=0;i < array.length; i++){
           if(i==0) currentLength=array[i].length();else{
               if(array[i].length() <currentLength){ currentLength=array[i].length(); index=i;   }
           }

       }
        nArray[0]= array[index];
       int count=1;
        for(int i =0;i<array.length;i++){
            if( i !=index){
                nArray[count]=array[i];
                count++;
            }
        }
       return nArray;

    }





}
