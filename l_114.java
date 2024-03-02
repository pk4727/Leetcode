package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class l_114 {
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

    public void flatten() {
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public void flatten2() {
        display(createLinkedList(root));
    }

    Deque<TreeNode> preorderQ = new LinkedList<>();

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        preorderQ.add(node);
        preorder(node.left);
        preorder(node.right);
    }

    private TreeNode createLinkedList(TreeNode node) {
        preorder(node);
        TreeNode root = preorderQ.pollFirst();
        if (!preorderQ.isEmpty()) {
            TreeNode temp = root;
            while (!preorderQ.isEmpty()) {
                temp.right = preorderQ.pollFirst();
                temp.left = null;
                temp = temp.right;
            }
        }
        return root;
    }

    private void display(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        display(node.left);
        display(node.right);
    }

}
