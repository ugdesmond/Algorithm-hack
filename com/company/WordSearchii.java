package com.company;
import com.google.gson.Gson;

import java.util.*;
public class WordSearchii {
   static Gson gson = new Gson();

    static List<String> result = new ArrayList<>();
    public static void main (String [] args){
       char [][] board={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
       String []  words = {"oath","apea","eat","rain"};
       findWords(board,words);
       System.out.println(result);
    }

    public static void findWords (char [][] board,String [] words){
        char[][] _board = null;
        ArrayList<String> _result = new ArrayList<String>();
            // Step 1). Construct the Trie
            TrieNode root = new TrieNode();
            for (String word : words) {
                TrieNode node = root;

                for (Character letter : word.toCharArray()) {
                    if (node.children.containsKey(letter)) {
                        node = node.children.get(letter);
                    } else {
                        TrieNode newNode = new TrieNode();
                        node.children.put(letter, newNode);
                        node = newNode;
                    }
                }
                node.word = word;  // store words in Trie

            }
       // System.out.println("<<<<BOARD>>>>>"+gson.toJson(root));
        }
    public  void backTracking (int row,int col,char [][] board,TrieNode root){
        Character key = board[row][col];
        TrieNode node =root.children.get(key);
        if(node.word != null){
           result.add(node.word);
            node.word = null;
        }
        board[row][col] = '#';

        int [] rowOffSet ={-1, 1, 0, 0};;
        int [] colOffSet ={0,0,-1,1};
        for(int x=0;x<4;x++){
            int i =row+rowOffSet[x];
            int j = col+colOffSet[x];
            if (i < 0 || i >= board.length || j < 0
                    || j >= board[0].length) {
                continue;
            }
            if(node.children.containsKey(board[i][j]))   {
                backTracking(i,j,board,node);
            }

        }


        board[row][col] = key;

        if(node.children.isEmpty()){
            node.children.remove(key);
        }

    }

}
