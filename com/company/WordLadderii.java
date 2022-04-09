package com.company;

import com.google.gson.Gson;

import java.util.*;

public class WordLadderii {

    Gson gson= new Gson();
    public static void main (String [] args){
        List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
        List<List<String>> result = new WordLadderii().findLadders("hit","cog",list);
        System.out.println("======"+result);
    }


    public List<List<String>> findLadders (String beginWord,String endWord,List<String> wordList){
        List< List<String>> result = new ArrayList<>();
        Set <String> dict = new HashSet<>(wordList);
        if(!dict.contains(endWord)) return  result;
        Queue<String> q = new LinkedList<>();
        Queue<List<String>> qList = new LinkedList<>();
        q.add(beginWord);
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        qList.add(list);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        while(!q.isEmpty()){
           int size = q.size();
           List<String> visitedList = new ArrayList<>();
           for(int i =0;i<size;i++){
               String curr = q.poll();
               List<String> currList = qList.poll();
               for(int j=0 ;j<curr.length();j++){
                   for(char x ='a';x<='z';x++){
                   String newWord= curr.substring(0,j) +x+curr.substring(j+1);
                   if(visited.contains(newWord)) continue;
                   if(newWord.equals(endWord)){
                       List<String> currNewList = new ArrayList<>(currList);
                       currNewList.add(newWord);
                       result.add(currNewList);
                   }else if(dict.contains(newWord)){
                       visitedList.add(newWord);
                       List<String> currNewList = new ArrayList<>(currList);
                       currNewList.add(newWord);
                       qList.add(currNewList);
                       q.add(newWord);
                   }
                   }
               }

           }
          visited.addAll(visitedList);
          if(result.size()!=0) return result;
        }

        return result;
    }
}




