nums = [1,2,3,4,5,6,7] # [5,6,7,1,2,3,4]
# nums = [1,2] # [2,1]
k = 3

# nums = [-1,-100,3,99] # [3,99,-1,-100]
# nums = [-1] # [-1]
# k = 2

class Solution(object):
    def rotate(nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = len(nums)
        k = k % len(nums)
        ls = nums[:l-k]
        le = nums[l-k:]
        nums[:len(le)] = le
        nums[len(le):] = ls

Solution.rotate(nums,k)
print(nums)