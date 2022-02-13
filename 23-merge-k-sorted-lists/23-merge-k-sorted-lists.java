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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        for(ListNode head : lists){
            while(head != null){
                MinHeap.add(head.val);
                head = head.next;
            }
        }
        
        ListNode result = new ListNode(0);
        ListNode p = result;
        while(!MinHeap.isEmpty()){
            p.next = new ListNode(MinHeap.poll());
            p = p.next;
        }
        
        return result.next;
    }
}