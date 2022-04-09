package com.company;

import com.google.gson.Gson;

import java.util.TreeMap;

public class Virus  {
    public static void main (String [] args){
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("(", 0);
        map.put(")", 0);
        map.put("+", 1);
        map.put("-", 1);
        map.put("*", 2);
        map.put("/", 2);
        System.out.println("========tree map==="+new Gson().toJson(map));
    }
}
