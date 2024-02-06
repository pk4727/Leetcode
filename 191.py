# Input: n = 00000000000000000000000000001011
# Output: 3
# Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
# Example 2:
# Input: n = 00000000000000000000000010000000
# Output: 1
# Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
# Example 3:
# Input: n = 11111111111111111111111111111101
# Output: 31
# Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.


class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=0
        n1=str(n)
        for i in n1:
            if i=="1":
                a+=1 
        return a                               #for string
        # return bin(n).count('1')             #for binary
        # return bin(n).count('0')
s=Solution()
print(s.hammingWeight(100000000000000000000000000001011))
print(s.hammingWeight(100000000000000000000000010000000))
print(s.hammingWeight(11111111111111111111111111111101))