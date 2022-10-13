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
    public List<Integer> inorderTraversal(TreeNode root) {
        //LNR
        
        List<Integer>a1=new ArrayList<>();
        in(root,a1);
        
        return a1;
    }
    public void in(TreeNode root,List<Integer> a1){
        if(root==null)return;
        
        in(root.left,a1);
        a1.add(root.val);
        in(root.right,a1);
        
        
    }
    
    
}