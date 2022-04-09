package com.company;

import com.google.gson.Gson;

public class BinaryTreeNodeSearch {


    public static void main (String args []){

        TreeNode treeNode = searchBST(Main.getTreeNode(),1);
        System.out.println("====Tree Node==="+new Gson().toJson(treeNode));
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root ==null) return null;

        if(root.val ==val) return root;

        return val< root.val?searchBST(root.left,val):searchBST(root.right,val);
    }




}
