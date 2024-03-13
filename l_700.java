package Leetcode;

public class l_700 {
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

    public TreeNode searchBST(TreeNode root, int x) {
        if (root == null) {
            return root;
        }
        if (root.val == x) {
            return root;
        }
        if (root.val < x) {
            return searchBST(root.right, x);
        }
        return searchBST(root.left, x);
    }

}
