# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        if head == None:
            return head
        
        tmp, itr = head, head.next
        while itr != None:
            if head.val != itr.val:
                head.next = itr
                head = head.next
                
            itr = itr.next
        head.next = None
                
        return tmp
            
        
        
        
        