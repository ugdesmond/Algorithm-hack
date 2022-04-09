package com.company;

public class ValidateBinaryTree {
   public static void main (String args []){
       boolean result = validateBST(Main.getTreeNode(),null,null);
       System.out.println("======Result===="+result);
   }

    public static  boolean validateBST(TreeNode node,Integer lower,Integer upper){
        if(node == null) return true;
        int val= node.val;
        if(lower != null  && lower>=val) return false;
        if(upper !=null && upper <= val) return false;

        if(!validateBST(node.right,val,upper)) return false;
        if(!validateBST(node.left,lower,val)) return false;

        return true;

    }
}
