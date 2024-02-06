# Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
# The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
# Return the quotient after dividing dividend by divisor.
# Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.


class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        x=dividend
        y=divisor       
        ans = 0
        a,b = abs(x), abs(y)
        for i in range(32, -1, -1):
            if a >= (b<<i):
                a -= (b<<i)
                ans += (1<<i)
        if (x>0 and y<0) or (x<0 and y>0): 
            ans = -ans
        return min(2**31-1, max(-2**31, ans))
s=Solution()
print(s.divide(10,3))
print(s.divide(7,-3))
print(s.divide(-2147483648,1))
print(s.divide(2147483647, 1))
print(s.divide(-2147483648, -1))