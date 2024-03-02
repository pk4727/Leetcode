package leetcode;

public class l_129 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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

    class Solution {
        public int sumNumbers(TreeNode root) {
            return sumNumbers(root, 0);
        }

        private int sumNumbers(TreeNode root, int s) {
            if (root == null) {
                return 0;
            }
            s = s * 10 + root.val;
            if (root.left == null && root.right == null) {
                return s;
            }
            return sumNumbers(root.left, s) + sumNumbers(root.right, s);
        }
    }
    int total = 0;

    private void sumNumbers(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        s += root.val;
        if (root.left == null && root.right == null) {
            total += Integer.valueOf(s);
        }
        sumNumbers(root.left, s);
        sumNumbers(root.right, s);
    }
}
