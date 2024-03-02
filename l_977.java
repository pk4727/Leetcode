// def sortedSquares(nums):
// sq =[i*i for i in nums]
// return sorted(sq)
package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class l_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i=0;i< nums.length;i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static int[] sortedSquares2(int[] nums){
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>();
        for (int i: nums){
            ans.add(i*i);
        }
        int index = 0;
        while(ans.size()!=0){
            nums[index] = ans.remove();
            index++;
        }
        return nums;
    }
}