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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)
            return head;
        ListNode p = head, itr = head.next;
        
        while(itr != null){
            if(head.val != itr.val){
                head.next = itr;
                head = head.next;
            }
            itr = itr.next;
        }
        head.next = null;
        
        return p;
        
    }
}