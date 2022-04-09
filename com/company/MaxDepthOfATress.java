package com.company;

import java.util.List;

public class MaxDepthOfATress {

    public static void main(String[] args) {
        TreeNode treeNode = getTreeNode();
        int result = maxDepth(treeNode);

        System.out.println("===tree node===" + result);
    }




    public static int maxDepth(TreeNode root) {
        if(root ==null) {return 0;}
        else{
            int max_left=maxDepth(root.left);
            int max_right=maxDepth(root.right);
            System.out.println(max_left+"=======max depth====="+max_right);
            return Math.max(max_left,max_right)+1;
        }
    }

    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);

        return treeNode;
    }
}
