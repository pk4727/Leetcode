nums = [3,2,3]
nums = [2,2,1,1,1,2,2]
nums = [3,3,4]
from collections import Counter
def majorityElement(nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = Counter(nums)
        maxcount = max(ans.values())
        for key, value in ans.items():
            if maxcount == value:
                return key
print(majorityElement(nums))