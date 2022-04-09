package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestWhileLoop {

    // Function to check if array has 2 elements
    // whose sum is equal to the given value
    static  List<List<Integer>> hasArrayTwoCandidates(int A[],int arr_size, int sum) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> intList= new ArrayList<>();
        Arrays.sort(A);
        int i,j;
        i=0;
        j=A.length-1;
        while(i<j){
          if(A[i]+A[j]==sum){
              intList.add(A[i]);
              intList.add(A[j]);
              list.add(intList);
              return  list;
          }
          else if(A[i]+A[j] <sum){
              i++;
          }
          else{
           j--;
          }
        }
        return list;
    }

    // Driver code
    public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int arr_size = A.length;

        // Function calling
        List<List<Integer>> result =hasArrayTwoCandidates(A, arr_size, n);
        System.out.println("======values "+new Gson().toJson(result));
    }

}
