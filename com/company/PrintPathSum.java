package com.company;
import com.google.gson.Gson;

import java.util.*;
public class PrintPathSum {

    public static void main (String args []){
        Gson gson= new Gson();
        TreeNode treeNode =Main.getPathSumTreeNode();
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(treeNode,22,paths,new ArrayList<>());
        System.out.println("==paths==="+gson.toJson(paths));
    }
    public static void findPaths(TreeNode treeNode,int sum,List<List<Integer>> paths,List<Integer> current){
        if(treeNode==null){
            return;
        }
        current.add(treeNode.val);
        if(treeNode.left==null && treeNode.right ==null && sum==treeNode.val){
            paths.add(current);
            return;
        }

            findPaths(treeNode.left,sum-treeNode.val,paths,new ArrayList<>(current));
            findPaths(treeNode.right,sum-treeNode.val,paths,new ArrayList<>(current));


    }
}
