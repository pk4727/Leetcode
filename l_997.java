package leetcode;

public class l_997 {
    public static int findJudge(int n, int[][] trust) {
        int[] outDegree = new int[n];
        int[] inDegree = new int[n];
        for (int[] i : trust) { // set [outDegree -> inDegree] value ++ for all array items
            outDegree[i[0] - 1]++;
            inDegree[i[1] - 1]++;
        }
        int mi = 0;
        for (int i = 1; i < n; i++) { // finding max inDegree value index
            if (inDegree[i] > inDegree[mi]) {
                mi = i;
            }
        }
        // matching inDegree is trusted by all(n-1) and inDegree not trust anyone(0)
        if (inDegree[mi] == n - 1 && outDegree[mi] == 0) {
            return mi + 1; // return inDegree trusted value
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findJudge(4, new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } }));
    }
}
