# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        walker1 = l1
        walker2 = l2
        dummy = ListNode()
        current = dummy
        carry = 0
        while (walker1 != None or walker2 != None): 
            if walker1 != None: 
                x = walker1.val
            else: 
                x = 0
            if walker2 != None: 
                y = walker2.val
            else: 
                y = 0
            result = x + y + carry
            carry = result//10
            current.next = ListNode(result%10)
            if (walker1.next != None): 
                walker1 = walker1.next
            if (walker2.next != None): 
                walker2 = walker2.next
            current = current.next
        if (carry != 0): 
            current.next = ListNode(carry)
        return dummy.next
