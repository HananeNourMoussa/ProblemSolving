#first solution, yield TLE

#approach: generate all substrings using sliding window, check for uniqueness of characters, keep track of max length

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        max_length = 0
        for k in range (1, n+1):
            if (self.notRepeated(s[:k])):
                window_length = len(s[:k])
                max_length = window_length
            for i in range (n-k):
                if (self.notRepeated(s[i+1:i+k+1])):
                    window_length = len(s[i+1:i+k+1])
                    max_length = max(window_length, max_length)
        return max_length
    def notRepeated(self, s):
        letters = dict()
        for i in range (len(s)):
            if s[i] in letters.keys():
                return False
            else:
                letters[s[i]] = 1

        return True
      
#optimized, intuitive, O(n) approach 

class Solution(object):      
    def lengthOfLongestSubstring(self, s):
        answer = ''
        result = 0
        for i in s:
            if i not in answer:
                answer += i
            else:
                if len(answer) > result:
                    result = len(answer)
                while i in answer:
                    answer = answer[1:]
                answer += i
        if len(answer) > result:
            result = len(answer)
        return result
