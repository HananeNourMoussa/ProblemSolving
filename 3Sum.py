class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        triplets = set()
        n = len(nums)
        nums.sort()
        for i in range (n-2):
            p = i+1
            q = n-1
            while(p < q):
                summ = nums[i] + nums[p] + nums[q]
                if summ == 0:
                    #sort the triplet, in order to effectively remove duplicates later on, and convert it to tuple (immutable), then add to set 
                    triplets.add(tuple(sorted([nums[i], nums[p], nums[q]])))
                    p = p+1
                    q = q-1
                elif summ < 0:
                    p = p+1
                else:
                    q = q-1
        #convert set to list of lists and return
        return [list(triplet) for triplet in triplets]
