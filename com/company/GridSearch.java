package com.company;

public class GridSearch {
    public static void main(String[] args) {
        String[] gridArray = {"123", "456", "456"};
        String[] searchArray = {"12", "45", "78"};
        String result = getGridSearch(gridArray,searchArray);
        System.out.println("======result===="+result);

    }


    public static String getGridSearch(String[] G, String[] P) {
        for (int i = 0; i < G.length - P.length; i++) {
            for (int j = 0; j < G[0].length() - P[0].length(); j++) {
            if(search(G,P,i,j))
                return "YES";
            }
        }
        return "NO";
    }

    public static boolean search(String[] G, String[] P, int i, int j) {
        for (int k = 0; k < P.length; k++) {
            for (int l = 0; l < P[0].length(); l++) {
            if(G[i+k].charAt(j+l) != P[k].charAt(l))
                return false;
            }
        }
        return true;
    }
}
