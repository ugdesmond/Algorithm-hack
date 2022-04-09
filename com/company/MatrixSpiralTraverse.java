package com.company;

import java.util.*;

public class MatrixSpiralTraverse {
    public static void main(String args[]) {
        int questionArray[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> questionResult = processSpiralTraversing(questionArray);
        System.out.println(questionResult);
    }

    public static List<Integer> processSpiralTraversing(int matrix[][]) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int x = columnBegin; x <= columnEnd; x++) {
                result.add(matrix[rowBegin][x]);
            }
            rowBegin++;
            for (int x = rowBegin; x <= rowEnd; x++) {
                result.add(matrix[x][columnEnd]);
            }
            columnEnd--;
            if (rowBegin <= rowEnd) {
                for (int x = columnEnd; x >= columnBegin; x--) {
                    result.add(matrix[rowEnd][x]);
                }
            }
            rowEnd--;
            if (columnBegin <= columnEnd) {
                for (int x = rowEnd; x >= rowBegin; x--) {
                    result.add(matrix[x][columnBegin]);
                }
            }
            columnBegin++;
        }
        return result;
    }

}
