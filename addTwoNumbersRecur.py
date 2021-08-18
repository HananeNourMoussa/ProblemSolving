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
        return self.recursive(l1, l2, 0)
    def recursive (self, l1, l2, carry): 
        
        if (l1 is None and l2 is None): 
            if (carry > 0): 
                return ListNode(carry)
            else: 
                return None
        if (l1 is None): 
            result = l2.val + carry
            l2 = l2.next
        elif (l2 is None): 
            result = l1.val + carry
            l1 = l1.next
        else: 
            result = l1.val + l2.val + carry
            l1 = l1.next
            l2 = l2.next
        carry = result//10
        node = ListNode(result%10)
        node.next = self.recursive(l1,l2,carry)
        return node
            
        
