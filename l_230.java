package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class l_230 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        int lheight;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private TreeNode root;

    Deque<Integer> ele = new ArrayDeque<>();

    private void element(TreeNode node) {
        if (node == null) {
            return;
        }
        element(node.left);
        ele.add(node.val);
        element(node.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        element(root);
        int ans = -1;
        while (k > 0) {
            ans = ele.pollFirst();
            k--;
        }
        return ans;
    }

    public int kthSmallest(int k) {
        return kthSmallest(root, k);
    }
}
