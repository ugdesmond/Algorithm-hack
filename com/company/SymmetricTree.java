package com.company;

public class SymmetricTree   {

        public static boolean isSymmetric(TreeNode root) {
            return isMirror(root,root);

        }
        public static boolean isMirror(TreeNode t1,TreeNode t2){
            if(t1==null && t2 ==null) return true;
            if(t1==null || t2 ==null) return false;
            return t1.val==t2.val && isMirror(t1.left,t2.right) &&isMirror(t1.right,t2.left);
        }











    public static void main(String args[])
    {
        TreeNode tree ;
        tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(4);
        tree.right.left = new TreeNode(4);
        tree.right.right = new TreeNode(3);
        boolean output = isSymmetric(tree);
        if (output == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
