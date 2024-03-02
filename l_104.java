package leetcode;

public class l_104 {
    public static class TreeNode {
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

    public int maxDepth() {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode node, int ans) {
        if (node == null) {
            return ans;
        }
        return Math.max(maxDepth(node.left, ans + 1), maxDepth(node.right, ans + 1));
    }
}
