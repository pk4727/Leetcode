package leetcode;

public class l_287 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(duplicate(arr));
        System.out.println(duplicate1(arr));
    }

    static int duplicate(int[] arr) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                // System.out.println(arr[i] +" "+ arr[j]);
                if (arr[i] == arr[j]) {
                    found = arr[i];
                    // System.out.println("found");
                    break;
                }
            }
        }
        return found;
    }

    // --------------------------------------------------------------------------------------------------------------

    static int duplicate1(int[] nums) {
        Cyclic_sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }
        return 0;
    }

    static int[] Cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
