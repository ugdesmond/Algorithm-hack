package com.company;

import com.google.gson.Gson;

/* Java program to implement basic stack
    operations */


    // Driver code
    class Man {
        public static void main(String args[]) {
            StackTest s = new StackTest();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack");
            System.out.println(s.pop() + " Popped from stack"+new Gson().toJson(s.array));
        }

    }
