package leetcode;

public class l_98 {

    // Definition for a binary tree node.
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

    private TreeNode root;

    class Solution {
        public boolean isValidBST() {
            return isValidBST(root, null, null);
        }

        public boolean isValidBST(TreeNode node, Integer min, Integer max) {
            if (node == null) {
                return true;
            }
            if (min != null && node.val <= min) {
                return false;
            }
            if (max != null && node.val >= max) {
                return false;
            } // set min and max value range for that node
            return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
        }
    }
}
