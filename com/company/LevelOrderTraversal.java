package com.company;
import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> subAnswer = new ArrayList<>();
            int nodeLevel = queue.size();
            for(int x=0;x<nodeLevel;x++){
                TreeNode  node = queue.remove();
                subAnswer.add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(subAnswer);
        }
        return result;
    }
}
