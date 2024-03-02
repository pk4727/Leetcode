nums = [5,5,5]
# nums = [5,5,50]
nums = [1,12,1,2,5,50,3]

def largestPerimeter(nums):
    nums.sort()
    maximun = -1
    sum = 0
    for i in range(len(nums)):
        if i >= 2 and nums[i] < sum:
            maximun = max(maximun, sum + nums[i])
        sum += nums[i]
    return maximun

print(largestPerimeter(nums))