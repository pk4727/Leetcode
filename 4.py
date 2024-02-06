# find mean of two array having range of array is (1 to 1000) and range of list degit is (-10^6<=l1 to l2<=10^6)

class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        a=nums1+nums2
        a1=sorted(a)
        l=len(a)
        l1=int(l/2)
        if l%2==0:
           return ((float(a1[l1])+float(a1[l1-1]))/float(2))
        else:
            return a1[l1]
o=Solution()
print(o.findMedianSortedArrays([4,5,8,2,9],[1,3,6]))
print(o.findMedianSortedArrays([4,5],[9,3,6]))