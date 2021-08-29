class Solution:
    def grep (self, strings, query, context):
        n = len(strings)
        hints = [0]*n
        for i in range (n):
            if hints[i] == 0 and query in strings[i]:
                #marking the radius
                for j in range (max(0,i-context), min(i+context, n-1)+1):
                    hints[j] = 1
        [print(strings[i]) for i in range(n) if hints[i] == 1]



sol = Solution()

file = ['uni bookstore',
         'buy',
         'author',
         'publishing house',
         'binding',
         'al akhawayn university',
         'melon']
key = 'uni'
context = 1
sol.grep(file, key, context)
