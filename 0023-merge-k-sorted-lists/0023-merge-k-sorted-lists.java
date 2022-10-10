/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */



//overall concept isme ye use hua hai ki bss pehle listnode se pooore values ko priority queue me dalenge (min priority queue) to apne aap sort hote jauyega




class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
       //priority queue me dalenege pooore vlaue ko listnode se 
        
        for(ListNode list : lists)
        {
            while(list!=null)
            {
                pq.add(list.val);
                list = list.next;
            }
        }
        
        
        
        
        ListNode ans = new ListNode(0);
        if(pq.size()==0) return null;
        
        
        
        //ab priority queue se listnode me dalenge 
        
        
        
        else{
            ListNode temp = ans;
            while(pq.size()!=0){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
    }
     return ans.next;   
  }
    
}
