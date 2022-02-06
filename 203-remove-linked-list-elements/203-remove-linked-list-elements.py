# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        
        sent = ListNode(-1, head)
        pred = sent
        
        while head:
            if head.val != val:
                sent.next = head
                sent = sent.next
                
            head = head.next
            
        sent.next = None
            
        return pred.next
                