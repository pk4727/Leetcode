package leetcode;

public class l_268 {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        System.out.println(missing_num_searching(arr));
        System.out.println(missing_num_sorting(arr));
    }

    static int missing_num_searching(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
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

    // ---------------------------------------------------------------------------------------------------------

    static int missing_num_sorting(int[] arr) {
        Cyclic_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

    static int[] Cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
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
