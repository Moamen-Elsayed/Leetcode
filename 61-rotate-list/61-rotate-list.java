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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        
        ListNode itr = head;
        int len = 1;
        while(itr.next != null){
            len++;
            itr = itr.next;
        }
        
        if(k == len || k%len == 0) return head;
        
        int cut =  len - (k%len) - 1, cnt = 0; 
        ListNode newHead = head.next, newTail=head;
        
        while(cnt < cut){
            newHead = newHead.next;
            newTail = newTail.next;
            cnt++;
        }
        
        itr.next = head;
        newTail.next = null;
        System.out.println(cnt + " " + len + " " + cut);
        System.out.println(newHead.val + " " + newTail.val + " " + itr.val + " " + head.val);
        
        return newHead;
    }
}