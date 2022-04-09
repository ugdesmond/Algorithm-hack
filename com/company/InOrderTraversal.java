package com.company;

import com.google.gson.Gson;

import java.util.*;

public class InOrderTraversal {
    static Gson gson = new Gson();

    public static void main(String[] args) {
     TreeNode treeNode= getTreeNode();
        List<Integer> result = inorderTraversal(treeNode);
        System.out.println("===In order mode===" + gson.toJson(result));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
      if(root != null){
          if(root.left != null){
              helper(root.left,res);
          }
          res.add(root.val);
          if(root.right != null){
              helper(root.right,res);
          }
      }
    }
    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        return treeNode;
    }
}
