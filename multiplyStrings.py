class Solution(object):
    def multiply (self, num1: str, num2: str) -> str:
        carry = 0
        product = 0
        for i in range (len(num1)-1, -1, -1):
            partial = ''
            for k in range (len(num1)-1-i):
                print('here')
                partial += '0'
            for j in range (len(num2)-1, -1, -1):
                res = int(num1[i]) * int(num2[j])+carry
                if (j != 0):
                    if res > 9:
                        partial+=str(res%10)
                        carry = res//10
                    else:
                        partial+=str(res)
                        carry = 0
                else:
                    partial+=str(res)[::-1]
                    carry = 0
                    
            print('partial: ', partial)
            product += int(partial[::-1])
            print(product)
        return str(product)

sol = Solution()

print(sol.multiply('123', '456'))
                
                
        
