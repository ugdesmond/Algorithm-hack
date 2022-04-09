package com.company;

import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main2 {
//    public static void main(String[] args) {
//        List<String> aList = new ArrayList<>();
//        aList.add(0, "Apple");
//        aList.add(1, "Mango");
//        aList.add(2, "Banana");
//        aList.add(1, "Melon");
//        aList.add(2, "Guava");
//        System.out.println("The ArrayList elements are: " + aList);
//        testDate();
//        isValidDate("");

//    }


    public int ParkingDilemma(int[] cars, int k) {
        Arrays.sort(cars);
        int len = cars.length;
        int min = cars[k - 1] - cars[0];
        for (int i = 1; i <= len - k; i++) {
            if (min > cars[k - 1 + i] - cars[i]) {
                min = cars[k - 1 + i] - cars[i];
            }
        }
        return min + 1;
    }

    public static void testDate() {
        try {
            String sDate1 = "2020-03-04 23:59:0";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate1);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date1);
            cal.add(Calendar.DAY_OF_MONTH, 3);
            cal.set(Calendar.HOUR_OF_DAY, 8);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);

            System.out.println("========date=====" + dateFormat.format(cal.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        dateFormat.setLenient(false);
        try {
            String date = dateFormat.format(new Date());
            System.out.println("====" + date);
        } catch (Exception pe) {
            return false;
        }
        return true;
    }

    public static void main(String[] agrs) {
//        int[][] questionArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        List<Integer> questionResult = customTester(questionArray);
//        System.out.println("=====hello world===="+questionResult);
//        int [] cars= {2, 10, 8, 17};
//       int val =  new Main2().ParkingDilemma(cars,3);
//               System.out.println(val);
        testMain();

    }


    private static List<List<Integer>> getPaschalTriangle(int rows) {
        List<List<Integer>> result = new ArrayList<>();
        if (rows <= 0)
            return result;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for (int i = 1; i < rows; i++) {
            row = new ArrayList<>();
            row.add(1);
            List<Integer> previousList = result.get(result.size() - 1);
            for (int x = 1; x < i; x++) {
                row.add(previousList.get(x - 1) + previousList.get(x));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }

    private static List<Integer> customTester(int[][] array) {
        //sum two strings without converting to integers
        List<Integer> result = new ArrayList<>();
        if (array.length == 0) return result;
        int rowBegin = 0;
        int rowEnd = array.length - 1;
        int columnBegin = 0;
        int columnEnd = array[0].length - 1;
        while (columnBegin <= columnEnd && rowBegin <= rowEnd) {
            //move tru first row
            for (int x = columnBegin; x <= columnEnd; x++) {
                result.add(array[rowBegin][x]);
            }
            rowBegin++;
            for (int x = rowBegin; x <= rowEnd; x++) {
                result.add(array[x][columnEnd]);
            }
            columnEnd--;
            if (rowBegin <= rowEnd) {
                for (int x = columnEnd; x >= columnBegin; x--) {
                    result.add(array[rowEnd][x]);
                }
            }
            rowEnd--;
            if (columnBegin <= columnEnd) {
                for (int x = rowEnd; x >= rowBegin; x--) {
                    result.add(array[x][columnBegin]);
                }
                columnBegin++;
            }
        }
        System.out.println(result);
        return result;
    }


    public static void testMain() {
        int[] array = {1, 2, 3};
        int[] test = {4 ,5, 6};
        int[] newArray =array ;
        newArray=test;
        newArray[0] =1;
        System.out.println("===j==value===" + new Gson().toJson(array));

    }


}