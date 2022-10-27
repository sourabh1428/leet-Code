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
    
    public int maxpd(TreeNode root, int maxv[]){
        if(root==null){
            return 0;
        }
        int ls=Math.max(0,maxpd(root.left,maxv));
        int rs=Math.max(0,maxpd(root.right,maxv));
        maxv[0]=Math.max(maxv[0],ls+rs+root.val);
        return Math.max(ls,rs)+root.val;
    }
    
    public int maxPathSum(TreeNode root) {
        int [] maxv= new int[1];
        maxv[0]=Integer.MIN_VALUE;
        
        maxpd(root,maxv);
        return maxv[0];
        
        
    }
}