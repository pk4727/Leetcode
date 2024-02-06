# range is 4000
class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        z={
        1:"I",      20:"XX",    200:"CC",       2000:"MM",
        2:"II",     30:"XXX",   300:"CCC",      3000:"MMM",
        3:"III",    40:"XL",    400:"CD",       4000:"MMMM",
        4:"IV",     50:"L",     500:"D",        5000:"V'",
        5:"V",      60:"LX",    600:"DC",       6000:"V'M",
        6:"VI",     70:"LXX",   700:"DCC",      7000:"V'MM",
        7:"VII",    80:"LXXX",  800:"DCCC",     8000:"V'MMM",
        8:"VIII",   90:"XC",    900:"CM",       9000:"I'X'",
        9:"IX",     100:"C",    1000:"M",       10000:"X'",
        10:"X"      
        }
        n=num
        a=[]
        i=10
        j=0
        while(j<n):
            m=n%i
            if m==0:
                pass
            else:
                a.append(m)
            n=n-m
            i*=10
        p=""
        for i in range(len(a)-1,-1,-1):
            for j in z.keys():
                if a[i]==j:
                    p+=z[j]
        return p
s=Solution()
print(s.intToRoman(1994))
print(s.intToRoman(194))
print(s.intToRoman(14))
print(s.intToRoman(1))