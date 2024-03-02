package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l_1609 {

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

    public boolean isEvenOddTree(TreeNode root) {
        boolean ans = true;
        boolean odd = true;
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevelNode = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevelNode.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            for (int i = 0; i < currentLevelNode.size(); i++) {
                if (odd) {
                    if (currentLevelNode.get(i) % 2 == 0
                            || (i > 0 && currentLevelNode.get(i) <= currentLevelNode.get(i - 1))) {
                        return false;
                    }
                } else {
                    if (currentLevelNode.get(i) % 2 != 0
                            || (i > 0 && currentLevelNode.get(i) >= currentLevelNode.get(i - 1))) {
                        return false;
                    }
                }
            }
            odd = !odd;
        }
        return ans;
    }
}
