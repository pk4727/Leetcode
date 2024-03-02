package leetcode;

public class l_513 {
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
        public int findBottomLeftValue(TreeNode root) {
            la = root.val;
            if (root.left == null) {
                if (root.right != null) {
                    findBottomLeftValue(root, 0);
                    return la;
                }
                return la;
            }
            findBottomLeftValue(root, 0);
            return la;
        }

        int la = 0;
        int ph = 0;

        public void findBottomLeftValue(TreeNode root, int height) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                if (ph < height) {
                    la = root.val;
                    ph = height;
                }
            }
            findBottomLeftValue(root.left, height + 1);
            findBottomLeftValue(root.right, height + 1);
        }
    }
}