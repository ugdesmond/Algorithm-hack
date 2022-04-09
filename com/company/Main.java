package com.company;

import com.google.gson.Gson;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
   static Gson gson= new Gson();
    public static void main(String[] args) {
        test();
        return;
//     String stringValue ="desmond";
//
//        String newWord = stringValue.substring(0, 0) + '*' + stringValue.substring(0 + 1, 7);
//        System.out.println("========"+newWord);
//
//     TreeSet<Integer> treeSet= new TreeSet<>();
//     treeSet.add(1);
//     treeSet.add(7);
//     treeSet.add(4);
//     treeSet.add(5);
//     double x= 3.5;
//        HashMap<String, Integer> map
//                = new HashMap<>();
//        map.put("a", 100);
//        map.put("b", 200);
//        map.put("c", 300);
//        map.put("a", 400);
//        {
//        }
//        Iterator<Integer> it = treeSet.iterator();
//        // print map details
//        while (it.hasNext()){
//            int val = it.next();
//
//                System.out.println(val+"HashMap: "
//                        + treeSet.floor(2));
//
//        }

       // int fibResult = fib(3);

       // System.out.println("===fib result==="+gson.toJson(map));
    }
   public static int fib (int n){
        if(n>=3){
            return fib(4-2)+ fib(5-2);
        }else{
            return 2;
        }
    }

    public static List<String> manipulateList(){
        List<String> resultList = new ArrayList<>();
        processList(resultList);
        int array []  = new int[4];
        return resultList;
    }
    public static void processList(List<String> listDetail){
        listDetail.add("Emeka");
        listDetail.add("Desmond");
        listDetail.add("Ngozi");

    }

    public static TreeNode getTreeNode(){
        TreeNode tree  ;
        tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(3);
        return tree;
    }

    public static TreeNode getPathSumTreeNode(){
        TreeNode tree  ;
        tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(8);
        tree.left.left = new TreeNode(11);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(2);
        tree.right.left = new TreeNode(13);
        tree.right.right = new TreeNode(4);
        tree.right.right.right = new TreeNode(1);
        return tree;
    }

        public static void test() {
            String str_Sample = "This is a hit  contains Example";
            //Check if String contains a sequence
            System.out.println("Contains sequence 'ing': " + str_Sample.contains("it"));
            System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
            //String contains method is case sensitive
            System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
            System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));
        }


}
