#  is palendrom range is -2^31 to 2^31

class Solution(object):
    def isPalindrome(self, x):
        if x<=(pow(2,31)-1) & x>=-pow(2,31):
            y=str(x)
            if y==y[::-1]:
                return True
            else:
                return False
        else:
            return False
o=Solution()
print(o.isPalindrome(12354))
print(o.isPalindrome(12354556654))
print(o.isPalindrome(12321))
print(o.isPalindrome(354453))
