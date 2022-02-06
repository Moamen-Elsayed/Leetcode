# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        
        if head.next == None:
            return None
        if head.next.next == None:
            head.next = None
            return head
        
        fast = head
        slow = head
        deleted = head
        
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            
        while deleted.next != slow:
            deleted = deleted.next
            

        deleted.next = slow.next
        return head
        
        
       