package com.company;

import com.google.gson.Gson;

public class BinaryTreeLeafNode {
    //Note that leaf node is when the left and right subtree are null;
    public static void main(String [] args){
        TreeNode node  = Main.getTreeNode();
        printAllLeafNode(node );
    }

    private static  void  printAllLeafNode(TreeNode node){
        if(node.right ==null && node.left==null){
            System.out.println("Leaf nodes==>"+node.val);
        }

        if(node.left!=null){
            printAllLeafNode(node.left);
        }
        if(node.right!=null){
            printAllLeafNode(node.right);
        }

    }

}
