package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class l_653 {
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

    public boolean findTarget(TreeNode root, int k) {
        Stack<Integer> s = new Stack<>();
        System.out.println(findTarget(root, k, s)); // less efficient
        HashSet<Integer> h = new HashSet<>();
        return findTarget(root, k, h); // efficient
    }

    public boolean findTarget(TreeNode root, int k, HashSet<Integer> h) {
        if (root == null) {
            return false;
        }
        if (h.contains(k - root.val)) {
            return true;
        }
        h.add(root.val);
        return findTarget(root.left, k, h) || findTarget(root.right, k, h);
    }

    public boolean findTarget(TreeNode root, int k, Stack<Integer> s) {
        if (root == null) {
            return false;
        }
        if (s.contains(k - root.val)) {
            return true;
        }
        s.push(root.val);
        return findTarget(root.left, k, s) || findTarget(root.right, k, s);
    }

    public boolean findTarget2(TreeNode root, int k) { // more time taken
        allNode(root);
        for (int i = 0; i < nodes.size(); i++) {
            for (int j = i + 1; j < nodes.size(); j++) {
                if ((nodes.get(i) + nodes.get(j)) == k) {
                    return true;
                }
            }
        }
        return false;
    }

    List<Integer> nodes = new ArrayList<>();

    public void allNode(TreeNode root) {
        if (root == null) {
            return;
        }
        nodes.add(root.val);
        allNode(root.left);
        allNode(root.right);
    }

}