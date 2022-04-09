package com.company;

import com.google.gson.Gson;

import java.util.*;

public class DiagonalTraverse {
    static Gson gson = new Gson();

    public static void main(String args[]) {

        int[][] questionArray = new int[3][3];
        int y = 0;
        for (int x = 0; x < questionArray.length; x++) {
            for (int k = 0; k < questionArray[0].length; k++) {

                questionArray[x][k] = ++y;
            }
        }
        System.out.println("======array values====" + gson.toJson(questionArray));
//        int[][] questionArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] questionResult = processDiagonalTravers(questionArray);
        System.out.println((Arrays.toString(questionResult)));
    }

    public static int[] processDiagonalTravers(int array[][]) {
        if (array == null || array.length == 0) return new int[0];
        int row = array.length;
        int column = array[0].length;
        List<Integer> intermediateResult = new ArrayList<>();
        int k = 0;
        int[] result = new int[column * row];
        //iterating through the dimension of the edges and the
        for (int x = 0; x < (row + column) - 1; x++) {
            intermediateResult.clear();
            //generate the head with column and row
            //r represent the  x cor-dinate
            //c represent the c cor-dinate
            //if x is equals the number of column enter the next row
            int r = x < column ? 0 : (x - column) + 1;
            //if the loop exceed the number of column or equal the number of column just maintain the last column.
            int c = x < column ? x : column - 1;



            System.out.println("====values===="+array[r][c]);


            //this where magic happens
            while (r < row && c > -1) {
                intermediateResult.add(array[r][c]);
                //increase the row count
                ++r;
                --c;
            }
            if (x % 2 == 0) {
                Collections.reverse(intermediateResult);
            }
            for (int i = 0; i < intermediateResult.size(); i++) {
                result[k++] = intermediateResult.get(i);
            }
        }
        return result;
    }
//    Complexity Analysis
//
//    Time Complexity: O(N \cdot M)O(N⋅M) considering the array has NN rows and MM
//    columns. An important thing to remember is that for all the odd
//    numbered diagonals, we will be processing the elements twice since
//    we have to reverse the elements before adding to the result array.
//    Additionally, to save space, we have to clear the intermediate array
//    before we process a new diagonal. That operation also takes O(K)O(K)
//    where KK is the size of that array. So, we will be processing all
//    the elements of the array at least twice. But, as far as
//    the asymptotic complexity is concerned, it remains the same.
//    Space Complexity: O(min(N, M))O(min(N,M)) since the extra
//    space is occupied by the intermediate arrays we use for storing
//    diagonal elements and the maximum it can occupy is the equal to
//    the minimum of NN and MM. Remember, the diagonal can only
//    extend till one of its indices goes out of scope.
}
