package leetcode;

public class l_1295 {
    public static void main(String[] args) {
        int[] arr = { 555, 901, 482, 1771 };
        System.out.println(find_even_digits_Number(arr));
    }

    static int find_even_digits_Number(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String digits = Integer.toString(arr[i]);
            int len = digits.length();
            if (len % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
