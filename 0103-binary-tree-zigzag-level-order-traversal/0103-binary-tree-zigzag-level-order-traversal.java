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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>>wrap=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList();
        
        if(root==null)return wrap;
        queue.offer(root);
        boolean flag=true;
        
        while(!queue.isEmpty()){
            
          int level=queue.size();
             ArrayList < Integer > subList = new ArrayList < Integer > (level);
            for(int i=0;i<level;i++){
                 int index=i;
                if(queue.peek().left!=null){queue.offer(queue.peek().left);}
                if(queue.peek().right!=null){queue.offer(queue.peek().right);}
               
                if(flag==true){
                    subList.add(queue.poll().val);
                    
                }
                else subList.add(0, queue.poll().val);
                
            }
            
            flag=!flag;
            wrap.add(subList);
            
            
            
        }
        return wrap;
        
        
        
        
        
        
    }
}