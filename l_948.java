package Leetcode;

import java.util.Arrays;

public class l_948 {
    public static void main(String[] args) {
        bagOfTokensScore(new int[] { 100, 200, 300, 400 }, 100);
    }

    public static void bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int start = 0;
        int end = tokens.length - 1;
        while (start <= end) {
            if (power >= tokens[start]) {
                score++;
                power -= tokens[start++];
            } else {
                if (power + tokens[end] >= tokens[start] && score != 0 && start != end) {
                    power += tokens[end--];
                    score--;
                } else {
                    break;
                }
            }
        }
        System.out.println(score);
    }
}
