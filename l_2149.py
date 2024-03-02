nums = [3,1,-2,-5,2,-4]
# nums = [-1,1]
def rearrangeArray(nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        positive = [i for i in nums if i>=0]
        negative = [i for i in nums if i<0]
        ans = []
        for i in range(len(positive)):
            ans.append(positive[i])
            ans.append(negative[i])
        return ans
print(rearrangeArray(nums))

# public int[] rearrangeArray(int[] nums) { // in java
#         int[] ans = new int[nums.length];
#         int posIntIndex = 0, negIntIndex = 1;
#         for(int i = 0; i < nums.length; i++) {
#             if(nums[i] > 0) {
#                 ans[posIntIndex] = nums[i];
#                 posIntIndex += 2;
#             }
#             else {
#                 ans[negIntIndex] = nums[i];
#                 negIntIndex += 2;
#             }
#         }
#         return ans;
#     }