package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l_103 {
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

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            boolean rev = false;
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevelNode = new ArrayList<>(levelSize);
                for (int i = 0; i < levelSize; i++) {
                    if (!rev) {
                        TreeNode current = queue.pollFirst();
                        currentLevelNode.add(current.val);
                        if (current.left != null) {
                            queue.addLast(current.left);
                        }
                        if (current.right != null) {
                            queue.addLast(current.right);
                        }
                    } else {
                        TreeNode current = queue.pollLast();
                        currentLevelNode.add(current.val);
                        if (current.right != null) {
                            queue.addFirst(current.right);
                        }
                        if (current.left != null) {
                            queue.addFirst(current.left);
                        }
                    }
                }
                rev = !rev;
                ans.add(currentLevelNode);
            }
            return ans;
        }
    }
}