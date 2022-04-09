package com.company;

import com.google.gson.Gson;

import java.util.Arrays;

public class wallsAndGates {
    static  Gson gson = new Gson();

    public static void main (String[] args){
        int[][] array ={{2147483647 , -1, 0  ,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647 , -1,2147483647,-1},
                {0 , -1,2147483647  ,2147483647}};
        wallsAndGates(array);
        System.out.println(gson.toJson(array));
    }

    public static void wallsAndGates(int[][] rooms) {
        for(int i =0; i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    dfs(i,j,0,rooms);}
            }
        }

    }

    public static  void dfs(int i, int j, int count, int[][] rooms){
        //room[i][j] if less than count return bc it is only gate and the walls(-1) should or can be less than count
        //
        if(i< 0 || i >= rooms.length || j<0 || j>= rooms[0].length || rooms[i][j] <count){
            return;
        }
        rooms[i][j]=count;
        System.out.println(("===count==="+count));
        dfs(i+1,j,count+1,rooms);
        dfs(i-1,j,count+1,rooms);
        dfs(i,j+1,count+1,rooms);
        dfs(i,j-1,count+1,rooms);

        System.out.println("==========finished========");
    }
}
