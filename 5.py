# Input: s = "babad"
# Output: "bab"
# Explanation: "aba" is also a valid answer.
# Input: s = "cbbd"
# Output: "bb"

import re
class Solution(object):
    def longestPalindromeSubseq(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "" or s == len(s) * s[0]:
            return len(s)
        p = s[0]
        l = 1
        for i in range(len(s)):
              for j in range(len(s), 0, -1):
                   w = s[i:j]
                   if w == w[::-1] and len(w) > l:
                        p = w
                        l = len(w)
        return len(p)


s=Solution()
print(s.longestPalindrome("babad"))
print(s.longestPalindrome("bab"))