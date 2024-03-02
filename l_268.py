def missingNumber(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        for i in range(n):
            if(i!=nums[i]):
                return i
        return n
print(missingNumber([1,2,0]))