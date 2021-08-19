class Solution(object):
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        quadruples = set()
        nums.sort()
        n = len(nums)
        for i in range(n-3):
            for j in range(i+1, n-2):
                p = j+1
                q = n-1
                while(p < q):
                    sumup = nums[i] + nums[j] + nums[p] + nums[q]
                    if sumup == target:
                        quadruples.add(tuple(sorted([nums[i], nums[j], nums[p], nums[q]])))
                        p += 1
                        q -= 1
                    elif sumup > target:
                        q -= 1
                    else:
                        p += 1
        return [list(quadruple) for quadruple in quadruples]
