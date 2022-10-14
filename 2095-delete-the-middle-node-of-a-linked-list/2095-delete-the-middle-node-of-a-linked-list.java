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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        //by turtle method
        ListNode slow=head;
        ListNode fast=head,prev=head;
        
        
         if (head == null)
            return null;
        if (head.next == null) 
        {
            return null;
        }
        
        
        while(fast!=null && fast.next!=null){
            
            prev=slow;
            slow=slow.next;
            
            //slow ko prev ,me daldo
            fast=fast.next.next;
        }
        //slow ab point krega mid ko
        prev.next=prev.next.next;
        
        return head;
        
    }
    
}