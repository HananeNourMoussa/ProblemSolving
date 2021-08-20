class Solution(object):
    def enter (self, nums, target, k):
        nums.sort()
        return self.kSum(nums, target, k)
    def kSum(self, nums, target, k):
        res = []
        if len(nums) == 0 or nums[0]*k > target or nums[-1]*k < target:
            return res
        if k == 2:
            return self.twoSum(nums, target)
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i-1]:
                for subset in self.kSum(nums[i+1:], target-nums[i], k-1):
                    res.append([nums[i]]+subset)
        return res
    def twoSum(self, nums, target):
        res = []
        p = 0
        q = len(nums)-1
        while(p < q):
            result = nums[p] + nums[q]
            if result < target or (p > 0 and nums[p] == nums[p-1]):
                p += 1
            elif result > target or (q < len(nums)-1 and nums[q] == nums[q+1]):
                q -= 1
            else:
                res.append([nums[p], nums[q]])
                p += 1
                q -= 1
        return res

sol = Solution()

print(sol.enter([1,0,-1,0,-2,2], 0, 4))
                
