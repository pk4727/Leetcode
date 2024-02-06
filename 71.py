# Input: path = "/home//foo/"
# Output: "/home/foo"
# Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.

class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        a= []
        path = path.split("/")
        for i in path:
            if a and i == "..":
                a.pop()
            elif i not in [".", "", ".."]:
                a.append(i)
        return "/" + "/".join(a)
s=Solution()
print(s.simplifyPath("/home//foo/"))
print(s.simplifyPath( "/../"))
print(s.simplifyPath( "/home/"))
print(s.simplifyPath("/a/./b/../../c/"))
print(s.simplifyPath("/."))
print(s.simplifyPath("/..."))