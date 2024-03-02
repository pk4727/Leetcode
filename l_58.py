s = "Hello World"
# s = "   fly me   to   the moon  "
# s = "luffy is still joyboy"

def lengthOfLastWord(s):
        l = s.split(" ")
        ans = ""
        for i in l:
            if i!="":
                ans=i
        return len(ans)
print(lengthOfLastWord(s))