package com.company;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pValue =p.val;
        int qValue =q.val;

        if(pValue< parentVal && qValue < parentVal ){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(pValue > parentVal && qValue > parentVal ){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;

    }
}
