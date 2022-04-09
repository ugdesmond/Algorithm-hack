package com.company;
import java.util.*;
public class WordLadder {
    public static void main (String [] args){
       List<String> list =Arrays.asList("hot","dot","dog","lot","log","cog");
        int result = new WordLadder().ladderLength("hit","cog",list);
        System.out.println("======"+result);
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int wordLength =beginWord.length();
        Map<String,List<String>> allIntermediateState= new HashMap<>();
        for(String word: wordList){
            for(int x=0;x<word.length();x++){
                String newWord =word.substring(0,x) +"*"+word.substring(x+1,wordLength);
                List<String> allComboWord =allIntermediateState.getOrDefault(newWord,new ArrayList<>());
                allComboWord.add(word);
                allIntermediateState.put(newWord,allComboWord);
            }}
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        Map<String,Boolean> visited= new HashMap<>();
        visited.put(beginWord,true);
        while(!queue.isEmpty()){
            Pair node= queue.remove();
            String word =node.getWord();
            int level = node.getLevel();
            for(int x=0;x<wordLength;x++){
                String newWord =  word.substring(0,x)   +"*"+ word.substring(x+1,wordLength);
                List<String> allComboWord=allIntermediateState.getOrDefault(newWord,new ArrayList<>());
                for(String adjacentWord:allComboWord){
                    if(adjacentWord.equals(endWord)){

                        return level+1;
                    }
                    if(!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        queue.add(new Pair(adjacentWord, level + 1));
                    }
                }

            }


        }
        return 0;
    }
}

class Pair{
    String word;
    Integer level;
    Pair(String word,Integer level){
        this.word=word;
        this.level=level;
    }
    public String getWord(){
        return word;
    }
    public Integer getLevel(){
        return level;
    }

}

