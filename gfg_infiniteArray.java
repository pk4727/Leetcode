package leetcode;

public class gfg_infiniteArray //// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
{
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(infiniteArray(arr, target));
    }

    static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        if (target > arr[end]) {
            int nstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = nstart;
        }
        return Binary_search(arr, target, start, end);
    }

    static int Binary_search(int[] arr, int target, int first, int last) {
        int start = first;
        int end = last;
        while (start <= end) {
            int mid = (start + ((end - start) / 2));
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}