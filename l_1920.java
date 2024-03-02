import java.util.Arrays;

public class l_1920 {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        // nums  = {nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]};
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[nums[i]];
        }
        nums = temp;
        return nums;
    }
}
