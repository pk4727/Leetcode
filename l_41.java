package leetcode;

public class l_41 {
    public static void main(String[] args) {
        // int[] arr = { 3, 4, -1, 1 };
        // int[] arr = { 1,2,0 };
        int[] arr = { 7, 8, 9, 11, 12 };
        // System.out.println(missing_num(arr));
        System.out.println(firstMissingPositive_cyclic_sort(arr));
    }

    static int missing_num(int[] arr) {
        for (int i = 1; i <= arr.length + 1; i++) {
            System.out.println(i);
            int found = LinearSearch(arr, i);
            if (found == -1) {
                return i;
            }
        }
        return 0;
    }

    static int LinearSearch(int[] arr, int number) {
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                found++;
            }
        }
        if (found == 0) {
            return -1;
        } else {
            return 1;
        }
    }

    // ----------------------------------------------------------------------------------------------------------------

    static int firstMissingPositive_cyclic_sort(int[] nums) {
        Cyclic_sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    static int[] Cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
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