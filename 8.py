# Input: s = "4193 with words"
# Output: 4193
# Explanation:
# Step 1: "4193 with words" (no characters read because there is no leading whitespace)
#          ^
# Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
#          ^
# Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
#              ^
# The parsed integer is 4193.
# Since 4193 is in the range [-231, 231 - 1], the final result is 4193.

# #--------------------------------------------------------------------------------------------------------------------------------------------------

import re
class Solution(object):
    def myAtoi(self, s):
        match = re.match(r'^\s*([+|-]?\d+)', s)
        if match:
            integer = int(match.group())
            return max(-(1 << 31), min(integer, (1 << 31) - 1))
        return 0

o=Solution()
print(o.myAtoi("-41862593 with words"))
print(o.myAtoi("with words 4271"))
print(o.myAtoi("  -41 with words"))
print(o.myAtoi("words and 987"))
print(o.myAtoi("    -42"))
print(o.myAtoi("-3111111111"))
print(o.myAtoi("91585671695555"))

# #--------------------------------------------------------------------------------------------------------------------------------------------------------

# class Solution(object):
#     def myAtoi(self, s):
#         a=[]
#         e=[]
#         b="1234567890-+"
#         for i in s:
#             if i.isalpha():
#                 break
#             elif i==".":
#                 break
#             elif i==" ":
#                 continue
#             elif i in b:
#                 if i=="1":
#                     a.append(1)
#                 elif i=="2":
#                     a.append(2)
#                 elif i=="3":
#                     a.append(3)
#                 elif i=="4":
#                     a.append(4)
#                 elif i=="5":
#                     a.append(5)
#                 elif i=="6":
#                     a.append(6)
#                 elif i=="7":
#                     a.append(7)
#                 elif i=="8":
#                     a.append(8)
#                 elif i=="9":
#                     a.append(9)
#                 elif i=="0":
#                     a.append(0)
#                 elif i=="+":
#                     e.append(1)
#                 elif i=="-":
#                     e.append(-1)
#         c=1
#         d=0
#         for i in range(len(a)-1,-1,-1):
#             d+=c*a[i]
#             c*=10
#         f=0
#         if d==0 :
#             return d
#         elif len(e)==0:
#             f=d
#         elif len(e)==1:
#             f=d*e[0]
#         elif len(e)>1:
#             f=0
#         if f>2147483647:
#             return 2147483647
#         elif f<= -2**31:
#             return -2**31
#         else:
#             return f
# o=Solution()
# print(o.myAtoi("-41862593 with words"))
# print(o.myAtoi("with words 4271"))
# print(o.myAtoi("  -41 with words"))
# print(o.myAtoi("words and 987"))
# print(o.myAtoi("    -42"))
# print(o.myAtoi("-3111111111"))
# print(o.myAtoi("91585671695555"))
