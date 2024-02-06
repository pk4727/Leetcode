# reverse the no in range -2^31 to 2^31

class Solution(object):
    def reverse(self, x):
        a=pow(2,31)
        if x>0:
            s=str(x)
            t=int(s[::-1])
            if t<a:
                return t
            else:
                return 0
        else:
            s=str(x)
            t=s[0]+s[::-1]
            u=int(t[:-1])
            if u>(a*-1):
                return u
            else:
                return 0
o=Solution()
print(o.reverse(56825485963))
print(o.reverse(2548963))
print(o.reverse(-12548963))
print(o.reverse(-12544788963))
