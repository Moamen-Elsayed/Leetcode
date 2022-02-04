# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        
        if list1 is None:
            return list2
        if list2 is None:
            return list1
        
        meregedList = ListNode() 
        head = meregedList
        
        
        while list1 != None and list2 != None:
            if list1.val < list2.val:
                head.next = list1
                list1 = list1.next
            else:
                head.next = list2
                list2 = list2.next
                
            head = head.next
            
        if list1 != None:
            head.next = list1
            
        if list2 != None:
            head.next = list2
                
        return meregedList.next