#generating permutations in lexicographic order
from math import factorial
#Algorithm :

'''
1. Take the previously printed permutation and find the rightmost character in it, which is smaller than its next character. Let us call this character as ‘first character’.
2. Now find the ceiling of the ‘first character’. Ceiling is the smallest character on right of ‘first character’, which is greater than ‘first character’. Let us call the ceil character as ‘second character’.
3. Swap the two characters found in above 2 steps.
4. Sort the substring (in non-decreasing order) after the original index of ‘first character’.
'''


class Permutations (object):
    def generate(self, nums):
        nums.sort()
        n = len(nums)
        
        for p in range (factorial(n)):
            print(nums)
            i = n-1
            while(i > 0 and nums[i-1] > nums[i]):
                i -= 1
            nums[i:] = reversed(nums[i:])
            
            if i > 0:
                j = i
                while(nums[i-1] > nums[j]):
                    j += 1
                nums[i-1], nums[j] = nums[j], nums[i-1]
            
    

sol = Permutations()

sol.generate(['a','b','c','d'])
