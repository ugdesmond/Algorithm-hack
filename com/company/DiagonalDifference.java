package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String [] args){
        List<Integer> rowList= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rowList.add(1);
        rowList.add(2);
        rowList.add(3);
        ans.add(rowList);
        rowList= new ArrayList<>();
        rowList.add(4);
        rowList.add(5);
        rowList.add(6);
        ans.add(rowList);
        rowList= new ArrayList<>();
        rowList.add(9);
        rowList.add(8);
        rowList.add(9);
        ans.add(rowList);
     int getDiagonal = diagonalDifference(ans);
     System.out.println("===result===="+getDiagonal);

    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        List<List<Integer>> ans = new ArrayList<>();
        int rowLength = arr.size();
        int columnLength = arr.get(0).size();
        int x =0;int y =0;
        List<Integer> list= new ArrayList<>();
        while(y < columnLength && x<rowLength){
            list.add(arr.get(x).get(y));
            ++x;
            ++y;
        }
        ans.add(list);
        int k =0;int l =columnLength-1;
        list= new ArrayList<>();
        while(k <rowLength && l>=0 ){
            list.add(arr.get(k).get(l));
            ++k;
            --l;
        }
        ans.add(list);
        System.out.println("==new Gson "+new Gson().toJson(ans));
        int sum =0;
        int total;
        for(List<Integer> listVal:ans){
             total = listVal.stream()
                    .reduce(0, Integer::sum);
             sum =total-sum;
        }
return Math.abs(sum);
    }
}
