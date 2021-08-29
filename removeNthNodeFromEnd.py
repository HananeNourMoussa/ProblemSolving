class Solution:
    def removeNthFromEnd_2pass(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #first get the length of the LL 
        dummy = ListNode(0)
        dummy.next = head
        walker = dummy
        length = 0
        while (walker != None): 
            length += 1
            walker = walker.next
        toDelete = length - n -1
        
        count = 0
        walker = dummy
        while (count < toDelete): 
            walker = walker.next
            count += 1
        walker.next = walker.next.next
        return dummy.next
    def removeNthFromEnd_1pass(self, head: Optional[ListNode], n: int) -> Optional[ListNode]: 
      #this solution uses the fast pointer slow pointer technique
        fast = head
        for i in range(n): 
          fast = fast.next
        slow = head
        prev = None
        while (fast != None): 
          prev = slow
          slow = slow.next
          fast = fast.next
        if (prev == None): 
          return head.next
        prev.next = slow.next
        return head
