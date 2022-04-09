package com.company;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main (String [] args){
        String  check ="6";
        System.out.println("====Big decimal====="+ new BigDecimalTest().isDigitIncreasing(22));
    }
    int sum = 0, count =0;
    int flag = 0;
    public  int isDigitIncreasing(int input_number)
    {
        int  n= get_number_of_digit(input_number);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum*10+1;
            count = count + sum;
        }

        for(int i=1; i<=9;i++)
        {
            if((input_number)==count*i)
            {
                flag = 1;
                break;
            }
            else
                flag = 0;
        }
        return flag;

    }
    public int get_number_of_digit(int num)
    {

        int size = 0;
        do
        {
            num = num/10;
            size++;
        }while(num>0);
        return size;
    }
}

