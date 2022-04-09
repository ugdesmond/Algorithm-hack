package com.company;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> pascalResult = generatePascalTriangle(5);
        System.out.println(pascalResult);

    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }
}
