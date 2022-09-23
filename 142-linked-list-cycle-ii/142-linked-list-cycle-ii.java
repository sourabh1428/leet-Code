/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> st=new HashSet<>();
        while(head!=null){
            if(st.contains(head)) return head;
            st.add(head);
            head=head.next;
        }
        return null;
    }
}