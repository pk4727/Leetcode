arr = [5,5,4]
k = 1

# arr = [4,3,1,1,3,3,2]
# k = 3

from collections import Counter
def findLeastNumOfUniqueInts( arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        for j in range(k):
                mv = len(arr)
                mc = len(arr)
                for i in arr:
                        mcc = arr.count(i)
                        if(mcc<mc):
                                mc=mcc
                                mv = i
                arr.remove(mv)
        return len(Counter(arr))

def findLeastNumOfUniqueInts( arr, k):  # efficient
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        ctr = Counter(arr)
        keys = sorted(ctr.keys(), key = lambda x: ctr[x])
        for key in keys:
            diff = min(k, ctr[key])
            ctr[key] -= diff
            k -= diff
        res = 0
        for key in ctr:
            if ctr[key] > 0:
                res += 1
        return res
print(findLeastNumOfUniqueInts(arr,k))