package com.company;

public class StackTest {
    int count;
    public static final  int MAX =1000;
    int [] array = new int[MAX];
    StackTest(){
        count=-1;
    }

    public boolean isEmpty(){
        return count<0;
    }

    public boolean push(int val)
    {
        if(count>=(MAX-1)){
            System.out.println("===StackOverflow==="+count);
            return false;
        }else{
            array[++count]=val;
        }
        return true;
    }

    public int pop()
    {
        if(count<0) return 0;
        else{
            return array[count--];
        }
    }


    public int peek()
    {
        if(count<0) return 0;
        else{
            return array[count];
        }
    }

}
