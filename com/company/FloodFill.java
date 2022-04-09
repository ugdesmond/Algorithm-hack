package com.company;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        dfs(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public void dfs (int image [][] ,int i,int j,int color,int newColor){
        if(i <0 || i>= image.length || j<0 || j >= image[0].length || color !=image[i][j]){
            return ;
        }
        image[i][j] = newColor;
        dfs(image,i+1,j,color,newColor);
        dfs(image,i-1,j,color,newColor);
        dfs(image,i,j+1,color,newColor);
        dfs(image,i,j-1,color,newColor);

    }
}
