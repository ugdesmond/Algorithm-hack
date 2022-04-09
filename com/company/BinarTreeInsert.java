package com.company;

import com.google.gson.Gson;

public class BinarTreeInsert {
    public static void main(String [] args){
        TreeNode node  = Main.getTreeNode();
        insertValueToBinarySearchTree(node,10 );
        System.out.println("=====total values=="+ new Gson().toJson(node));



    }


    private static  TreeNode insertValueToBinarySearchTree(TreeNode node,int val){
        if(node== null){
            node = new TreeNode(val);
          return node;
        }

        if(val>node.val){
           node.right= insertValueToBinarySearchTree(node.right,val);
        }else{
            node.left=  insertValueToBinarySearchTree(node.left,val);
        }
return node;

    }
}
