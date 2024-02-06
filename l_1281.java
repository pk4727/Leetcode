package leetcode;

public class l_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    static int subtractProductAndSum(int n){
        int s = sum_of_digits(n);
        int p = product_of_digits(n);
        return  p-s;
    }
    static int sum_of_digits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum_of_digits(n/10);
    }

    static int product_of_digits(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * product_of_digits(n/10);
    }
}