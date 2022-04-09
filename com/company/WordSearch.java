package com.company;


import java.util.ArrayList;
import java.util.List;

public class WordSearch {


    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word  ="ABCCED";
        boolean result = exist(board,word);
        System.out.println("====result=="+result);

    }


    public static boolean exist(char[][] board, String word) {
        for(int i =0;i <board.length;i++){
            for(int j =0;j <board[i].length;j++){
                if(board[i][j]==word.charAt(0) && searchWord(word,board,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public  static boolean searchWord(String word,char board[][],int i,int j,int count) {
      if(count == word.length()){
          return false;
      }
        if(i<0 || i>= board.length || j<0 || j >= board[0].length || board[i][j]
                != word.charAt(count)){
            return false;
        }
        char temp =board[i][j];
        board[i][j]=' ';

        //perform magic
        boolean found= searchWord(word,board,i+1,j,count+1) ||
                searchWord(word,board,i-1,j,count+1) ||
                searchWord(word,board,i,j+1,count+1) ||
                searchWord(word,board,i,j-1,count+1);

         board[i][j] =temp;
        return found;

    }
}
