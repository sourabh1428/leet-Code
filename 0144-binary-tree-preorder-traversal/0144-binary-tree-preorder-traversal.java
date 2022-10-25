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
   
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer>arr=new ArrayList<>();
        if(root!=null){
            arr.add(root.val);
            arr.addAll(preorderTraversal(root.left));
            arr.addAll(preorderTraversal(root.right));
        }
        
        return arr;
        
    }
}