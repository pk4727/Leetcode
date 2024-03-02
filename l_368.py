nums = [1,2,3]      # Output: [1,2]
nums = [1,2,4,8]    # Output: [1,2,4,8]
nums = [3,4,16,8]
nums = [2,3,4,8]

def largestDivisibleSubset(nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return []
        nums.sort()
        # Initialize a list of lists to store subsets
        ansList = [[num] for num in nums]
        print(ansList)
        for i in range(1, len(nums)):
            for j in range(i):
                # Check if the current number is divisible by the numbers in the previous subset
                if nums[i] % nums[j] == 0 and len(ansList[i]) < len(ansList[j]) + 1:
                    ansList[i] = ansList[j] + [nums[i]]
        ans = max(ansList, key=len)
        return ans

print(largestDivisibleSubset(nums)) #doubt
