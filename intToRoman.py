class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        nums = {1: 'I', 4: 'IV', 5: 'V', 9: 'IX', 10: 'X', 40: 'XL', 50: 'L', 90: 'XC',100: 'C', 400:'CD', 500: 'D', 900: 'CM', 1000: 'M'}
        
        if num in nums: 
            return nums[num]
        else: 
            result = ''
            while (num >= 1): 
                for i in list(nums.keys())[::-1]: 
                    if num - i >= 0: 
                        result += nums[i]
                        num = num - i
                        break
            return result

s = Solution()
print(s.intToRoman(91))
