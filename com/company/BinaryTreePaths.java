package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main (String args []){
        Gson gson= new Gson();
        TreeNode treeNode =Main.getPathSumTreeNode();
        List<String> paths = new ArrayList<>();
        findPaths(treeNode,paths," ");
        System.out.println("==paths==="+paths);
    }
    public static void findPaths(TreeNode treeNode,List<String> paths,String current){
        if(treeNode==null){
            return;
        }
         current+=treeNode.val;
        if(treeNode.left==null && treeNode.right ==null){
            paths.add(current.toString());
            return;
        }

        findPaths(treeNode.left,paths,current+"->");
        findPaths(treeNode.right,paths,current+"->");


    }
}
