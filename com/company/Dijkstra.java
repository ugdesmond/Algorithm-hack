package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Dijkstra {
    public static void main(String[] args) {
        Stack<String> ops  = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        int length = st.length();
        int x =0;
        while (x <length ) {
            String s =  String.valueOf(st.charAt(x));
            if (s.equals("(")) ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("*"))    v = vals.pop() * v;
                else if (op.equals("/"))    v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
           length--;
           x++;
        }
        System.out.println(vals.pop());
    }
}
