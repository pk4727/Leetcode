# Input: nums = [1,3,1,1,2]
# Output: [5,0,3,4,0]
# Explanation: 
# When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
# When i = 1, arr[1] = 0 because there is no other index with value 3.
# When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. 
# When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. 
# When i = 4, arr[4] = 0 because there is no other index with value 2. 


class Solution(object):
    def distance(self, n):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        b=[]
        for i in range(len(n)):
            b.append(0)
            for j in range(0,len(n)):
                if i!=j:
                    if n[i]==n[j]:
                        b[i]+=i-j
        return b
s=Solution()
print(s.distance([1,3,1,1,2]))
s.distance([0,5,3])