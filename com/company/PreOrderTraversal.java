package com.company;

import com.google.gson.Gson;

import java.util.*;

public class PreOrderTraversal {
    static Gson gson = new Gson();

    public static void main(String[] args) {
        TreeNode treeNode = getTreeNode();
        List<Integer> result = preorderTraversal(treeNode);

        System.out.println("===tree node===" + gson.toJson(result));
    }

    public static  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            list.add(node.val);
            if (node.right != null) {
                nodeStack.add(node.right);
            }
            if (node.left != null) {
                nodeStack.add(node.left);
            }
        }
        return list;
    }


    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.left = new TreeNode(3);
        return treeNode;
    }
    //Time complexity is O(V+E)
    //where o v is Verteces and E edges
}