package leetcode;
public class l_231{
    public static boolean isPowerOfTwo(int n) {
        if(n <= -2147483647  ||  n >= (2147483647-1)){
            return false;
        }
        int range = 0;
        int power = 0;
        while(power<n){
            power = (int)Math.pow(2,range);
            if(power==n){
                return true;
            }
            range++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}