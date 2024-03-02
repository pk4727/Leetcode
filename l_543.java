package leetcode;

public class l_543 {
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

    int max_dia;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // this set max dia
        return max_dia;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        int dia = left + right;
        max_dia = Math.max(max_dia, dia);
        return Math.max(left, right) + 1;
    }
}