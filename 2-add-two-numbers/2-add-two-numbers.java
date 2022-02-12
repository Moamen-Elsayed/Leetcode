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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode res = new ListNode();
        ListNode P = res;
        int num1=0, num2=0, carry=0;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null){
                num1 = l1.val;
                l1 = l1.next;
            }else{
                num1 = 0;
            }if(l2!=null){
                num2 = l2.val;
                l2 = l2.next;
            }else{
                num2 = 0;
            }
            
            int tmp = num1 + num2 + carry;
            P.next = new ListNode(tmp%10);
            P = P.next;
            carry = tmp / 10;
        }
        
        return res.next;
    }
}