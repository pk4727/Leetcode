public class l_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int max = 0;
        for (int i : nums) {
            if (i == 1) {
                max++;
            } else {
                if (max > max1) {
                    max1 = max;
                    max = 0;
                }
                max = 0;
            }
        }
        if (max > max1) {
            return max;
        }
        return max1;
    }
}