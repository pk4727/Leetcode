# Input: s = "leet**cod*e"
# Output: "lecoe"
# Explanation: Performing the removals from left to right:
# - The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
# - The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
# - The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
# There are no more stars, so we return "lecoe".

class Solution(object):
    def removeStars(self, s):
        """
        :type s: str
        :rtype: str
        """
        a=""
        b="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        for i in s:
            if i.upper() in b:
                a+=i
            else:
                a=a[:-1]
        return a
s=Solution()
s.removeStars("erase*****")
print(s.removeStars("leet**cod*e"))
# print(s.removeStars("erase*****"))