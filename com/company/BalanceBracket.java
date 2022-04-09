package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BalanceBracket {

    public static void main (String [] args){
        String test = "]";
       boolean val = balanceArray(test);
       System.out.println("====stack values are==="+val);
    }

    public static boolean balanceArray (String s){
        if(s == null || s=="") return false;
        Stack<Character> stack = new Stack <>();
        char[] arrayChar = s.toCharArray();
        for(char  val :arrayChar){
            if(val == '('|| val== '{' || val == '['){
                stack.push(val);
            }else{
            if(!stack.isEmpty() ){
                char strVal = stack.peek();
                if(val == ')'  && strVal == '(' ) {
                    stack.pop();
                }
                else if(val == '}'  && strVal == '{' ) {
                    stack.pop();
                }
                else if(val == ']'  && strVal == '[' ) {
                    stack.pop();
                }
                else  return false;

            }else{
                return false;
            }

            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
