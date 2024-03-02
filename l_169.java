package leetcode;

public class l_169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int value=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(count<c){
                count=c;
                value=nums[i];
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
