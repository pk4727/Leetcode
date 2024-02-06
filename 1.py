#return the index which sum is target

class Solution(object):
    def twoSum(self, nums, target):
        a=[]
        for i in range(len(nums)-1):
           for j in range(1,len(nums)):
                if (nums[i]+nums[j])==target:
                    return [i,j]
obj=Solution()
print(obj.twoSum([1,3,5],6))
print(obj.twoSum([2,7,5,8],13))
print(obj.twoSum([9,4,3,6,7,5],11))
