#generating next permutation in lexicographic order 
class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        
        while(i >= 0 and nums[i+1] <= nums[i]): 
            i -= 1
        if i >= 0: 
            j = n-1 
            while(nums[j] <= nums[i]): 
                j-=1
            nums[i], nums[j] = nums[j], nums[i]
        nums[i+1:] = reversed(nums[i+1:])
        return nums
