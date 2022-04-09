package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class exquisitory {

        public static void main(String[] args) {
            //sum ,takes a string which includes 1,2,3,-3,4
            List<String> test= new ArrayList<>();
            String val = "1+4-4+3+9+2-1-4+6";
            char [] charVal = val.toCharArray();
             int totalSum=0;
            int count =0;
            for(Character ch:charVal){
                if(ch.equals('+')){
                    if(count != 0)
                        totalSum +=Character.getNumericValue(charVal[count-1]);
                }
                if(ch.equals('-')){
                    if(count != 0)
                        totalSum -= Character.getNumericValue(charVal[count-1]);
                }
                count++;
            }
            System.out.println(count+"Total sum= "+totalSum);

        }






}
