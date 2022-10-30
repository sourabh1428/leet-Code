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
    private int[] count=new int[1];
    
    public int countNodes(TreeNode root) {
        inOrderTrav(root,count);
        return count[0];
    }
    public void inOrderTrav(TreeNode  curr, int count[]) {
  if (curr == null)
    return;

  count[0]++;
  inOrderTrav(curr . left, count);
  inOrderTrav(curr . right, count);
}
}