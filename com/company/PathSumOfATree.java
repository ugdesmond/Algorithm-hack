package com.company;


import com.google.gson.Gson;

import java.util.*;
public class PathSumOfATree {
    public static void main (String args []){
        TreeNode treeNode =Main.getPathSumTreeNode();
        boolean hasPathSum = hasPathSum(treeNode,22);
        System.out.println("=====HasPathSum======"+hasPathSum);

    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        Gson gson= new Gson();
        if(root ==null ) return false;
        Stack<TreeNode>  nodeStack = new Stack<>();
        Stack<Integer> sumStack= new Stack <>();
        List<Integer> treeNodes = new ArrayList<>();
        sumStack.push(root.val);
        nodeStack.push(root);
        treeNodes.add(root.val);
        while(!nodeStack.isEmpty()){
            TreeNode currentNode = nodeStack.pop();
            Integer currentSum = sumStack.pop();

            if(currentNode.left ==null && currentNode.right==null && currentSum==sum)
            {
                return true;
            }
            if(currentNode.right != null){
                nodeStack.push(currentNode.right);
                sumStack.push(currentSum+currentNode.right.val);
            }

            if(currentNode.left != null){
                nodeStack.push(currentNode.left);
                sumStack.push(currentSum+currentNode.left.val);
            }
        }
        return false;
    }

    public static int  getTotalSum (List<Integer> list){
        int y =0;
        for(int x=0;x<list.size();x++) {
            y+=list.get(x);
        }
        return y;
    }
}
