class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        result = ''
        dp = [[False]*n for _ in range(n)]
        for i in range (n):
            for j in range(i,n):
                #base case 1
                if i == j:
                    dp[i][j] = True
                    if len(result) < 1:
                        result = s[i: j+1]
                elif (i+1 == j and s[i] == s[j]) or (i+1 <= j-1 and s[i] == s[j] and dp[i+1][j-1] == True):
                    dp[i][j] = True
                    if len(result) < len(s[i:j+1]):
                        result = s[i:j+1]
        return result
