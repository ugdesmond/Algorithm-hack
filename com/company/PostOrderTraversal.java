package com.company;
import com.google.gson.Gson;

import java.util.*;
public class PostOrderTraversal {

    static Gson gson = new Gson();

    public static void main(String[] args) {
        TreeNode treeNode = getTreeNode();
        List<Integer> result = postorderTraversal(treeNode);

        System.out.println("===tree node===" + gson.toJson(result));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root ==null) return result;
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.left !=null)
                stack.add(node.left);
            if(node.right!=null)
                stack.add(node.right);
        }
        Collections.reverse(result);
        return result;
    }

    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        return treeNode;
    }
}
