#checking if a binary tree is a binary search tree
import sys
class BinaryTree(object):
    def __init__(self, val = 0, left = None, right = None):
        self.val = val
        self.left = left
        self.right = right
    #method for in order traversal
    def traverse (self, node):
        if (node == None):
            return
        self.traverse(node.left)
        print(node.val)
        self.traverse(node.right)
    def isBST (self, node, mini, maxi):
        if (node == None):
            return True
        if (node.val < mini or node.val > maxi):
            return False
        return (self.isBST(node.left, mini, node.val-1)) and (self.isBST(node.right, node.val+1, maxi))
        


#construct a binary tree

child5 = BinaryTree(54)
child2 = BinaryTree(72, child5)
child4 = BinaryTree(23)
child3 = BinaryTree(12)
child1 = BinaryTree(17, child3, child4)
root = BinaryTree(50, child1, child2)

root.traverse(root)

print(root.isBST(root, -sys.maxsize-1, sys.maxsize))
