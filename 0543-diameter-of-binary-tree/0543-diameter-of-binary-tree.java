/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */



class Solution {
    private int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        findmax(root);
        return maxi;
        
    }
    
    
    public int findmax(TreeNode root){
        if(root==null)return 0;
       int lh=findmax(root.left);
        int rh=findmax(root.right);
        maxi=Math.max(maxi,lh+rh);
        
        return 1+Math.max(lh,rh);
        
    }
}