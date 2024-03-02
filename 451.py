s = "raaeaedere"
s = "tree"
s = "Aabb"


l = {}
for i in range(0,len(s)):
    ele = s[i]
    if ele in l.keys():
        l.update({ele:l.get(ele)+1})
    else:
        l[ele]=1
sd = sorted(l.items(), key=lambda x:x[1], reverse=True)
ans = ""
for i in sd:
    for j in range(0,i[1]):
        ans+=i[0]


print(ans)