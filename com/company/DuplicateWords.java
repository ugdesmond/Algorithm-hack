package com.company;

public class DuplicateWords {
//    Find the first repeated word in a string
    public static void main(String[] args) {
        String string = "big black bug bit a bit big big dog on his big black nose";
        getWord(string);
    }


    public static String  getWord (String str){

        String words[] = str.split(" ");
        int smallestIndex =Integer.MAX_VALUE;
        String repeatedWord ="";
        for(int x =0 ;x< words.length;x++){
            for(int i =x+1;i<words.length;i++){
                    if(words[x].equals(words[i])){
                        if(i < smallestIndex){
                            smallestIndex=i;
                            break;
                        } }
                        }
        }
        repeatedWord =words[smallestIndex];
        System.out.println(repeatedWord);
        return repeatedWord;
    }
}
