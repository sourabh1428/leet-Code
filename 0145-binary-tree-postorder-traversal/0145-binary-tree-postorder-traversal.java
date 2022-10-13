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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a1=new ArrayList<>();
        
        pos(root,a1);
        return a1;
        
        
    }
    public void pos(TreeNode root,List<Integer> a1){
        if(root==null)return;
        
        pos(root.left,a1);
        pos(root.right,a1);
        a1.add(root.val);
        
        
    }
}