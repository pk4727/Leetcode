s="abc"
# s="aaa"
def countSubstrings(s):
    """
    :type s: str
    :rtype: int
    """
    n=len(s)
    ans=0
    for a in range(n):
        i,j=a,a
        while 0<=i<n and 0<=j<n and s[i]==s[j]:
            ans+=1
            i-=1
            j+=1
        i,j=a,a+1    
        while 0<=i<n and 0<=j<n and s[i]==s[j]:
            ans+=1
            i-=1
            j+=1
    return ans
print(countSubstrings(s))  # doubt