# Example 1:
# Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
# Output: true
# Explanation: We might do the following sequence:
#    push(1), push(2), push(3), push(4),
#    pop() -> 4,
#    push(5),
#    pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
# Example 2:
# Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
# Output: false
# Explanation: 1 cannot be popped before 2.



class Solution(object):
    def validateStackSequences(self, pushed, popped):
        """
        :type pushed: List[int]
        :type popped: List[int]
        :rtype: bool
        """
        a = []
        i = 0
        for x in pushed:
            a.append(x)
            while a and a[-1] == popped[i]:
                a.pop()
                i += 1
        return not a
s=Solution()
print(s.validateStackSequences([1,2,3,4,5], [4,5,3,2,1]))
print(s.validateStackSequences([2,3,0,1], [0,3,2,1]))
print(s.validateStackSequences([2,1,0], [1,2,0]))


        # a=[]
        # b=0
        # c=[]
        # for i in range(len(pushed)):
        #     print(pushed[i],popped[b])
        #     if len(c)==0:
        #         print("if")
        #         c.append(pushed[i])
        #     elif c[-1]==popped[b]:
        #         while(c[-1]==popped[b]):
        #             print("if1")
        #             a.append(c[-1])
        #             c.pop()
        #             c.append(pushed[i])
        #     elif pushed[i]==popped[b]:
        #         print("if2")
        #         a.append(pushed[i])
        #         b+=1
        #     else:
        #         print("if3")
        #         c.append(pushed[i])
        # for i in range(len(c)-1,-1,-1):
        #     a.append(c[i])
        # return a,c
        # if a==popped:
        #     return True
        # else:
        #     return False