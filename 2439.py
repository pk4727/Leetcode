# Input: nums = [3,7,1,6]
# Output: 5
# Explanation:
# One set of optimal operations is as follows:
# 1. Choose i = 1, and nums becomes [4,6,1,6].
# 2. Choose i = 3, and nums becomes [4,6,2,5].
# 3. Choose i = 1, and nums becomes [5,5,2,5].
# The maximum integer of nums is 5. It can be shown that the maximum number cannot be less than 5.
# Therefore, we return 5.

class Solution(object):
    def minimizeArrayValue(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=nums
        print(nums)
        for i in range(1,len(nums)):
            if i in n:
                nums[i-1]=nums[i-1]+1
                nums[i]=nums[i]-1
                print(nums)
        return max(nums)
s=Solution()
print(s.minimizeArrayValue([3,7,1,6]))
print(s.minimizeArrayValue([10,1]))
# print(s.minimizeArrayValue())
# print(s.minimizeArrayValue())
# print(s.minimizeArrayValue())