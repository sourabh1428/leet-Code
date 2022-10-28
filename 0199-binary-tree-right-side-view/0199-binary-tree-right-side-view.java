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
    
    private ArrayList<Integer>arr=new ArrayList<>();
    
    
    public List<Integer> rightSideView(TreeNode root) {
        int level=0;
        righthelp(root,level);
        return arr;
        
    }
    public void righthelp(TreeNode root,int level){
        
        if(root==null)return;
        
        if(level==arr.size()){
            arr.add(root.val);
        }
        righthelp(root.right,level+1);
        righthelp(root.left,level+1);
        
    }
    
    
    
}