package Leetcode;

public class l_560 {
    public int subarraySum(int[] arr, int s) {
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == s){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
