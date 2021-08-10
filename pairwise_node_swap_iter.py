class Node:
    def __init__(self, data = 0, next = None):
        self.data = data
        self.next = next

head = Node(1, Node(2, Node(3, Node(4))))




print('Before pairwise node swap: \n')

walker = head
while(walker != None):
    print(walker.data)
    walker = walker.next

dummy = Node(0, head)

prev, curr = dummy, head

while(curr and curr.next):
    nxtpair = curr.next.next
    second = curr.next

    second.next = curr
    curr.next = nxtpair
    prev.next = second

    prev = curr
    curr = nxtpair

print('After pairwise node swap: \n')

    
walker = dummy.next
while(walker != None):
    print(walker.data)
    walker = walker.next
