package com.company;

import com.google.gson.Gson;

public class NumberOfIsland {
static Gson gson= new Gson();
    public static void main (String args []){
        char[][] array ={{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
     int result  = numIslands (array);
        System.out.println(gson.toJson(result));
    }
    public static int numIslands(char[][] grid) {
        if(grid.length ==0) return 0;
        int result =0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid) ;
                    result++;
                }

            }
        }
        return result;
    }
    public static void dfs(int i, int j, char[][] array){
        if(i< 0 || i >= array.length || j<0 || j>= array[0].length || array[i][j] !='1'){
            return;
        }

        array[i][j]=0;
        dfs(i+1,j,array);
        dfs(i-1,j,array);
        dfs(i,j+1,array);
        dfs(i,j-1,array);
    }
}
