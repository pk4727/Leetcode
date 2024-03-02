package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class l_105 {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if (preorder.length == 0) {
                return null;
            }
            int rootval = preorder[0];
            int index = 0;
            for (int i = 0; i < inorder.length; i++) {
                if (rootval == inorder[i]) {
                    index = i;
                }
            }
            TreeNode node = new TreeNode(rootval);
            node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
            node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                    Arrays.copyOfRange(inorder, index + 1, inorder.length));
            return node;
        }
    }

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        HashMap<Integer, Integer> inOrderIndex = new HashMap<>();
        for (int index = 0; index < inOrder.length; index++) {
            inOrderIndex.put(inOrder[index], index);
        }
        int[] index = { 0 };
        return buildTree(preOrder, inOrder, 0, preOrder.length - 1, inOrderIndex, index);
    }

    private TreeNode buildTree(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer, Integer> inOrderIndex, int[] index) {
        if (left > right) { // array is empty
            return null;
        }
        int current = preOrder[index[0]]; // root node
        index[0]++;
        TreeNode node = new TreeNode(current);
        if (left == right) { // at leaf node
            return node;
        }
        int inIndex = inOrderIndex.get(current); // in inorder root node at index this
        node.left = buildTree(preOrder, inOrder, left, inIndex - 1, inOrderIndex, index);
        node.right = buildTree(preOrder, inOrder, inIndex + 1, right, inOrderIndex, index);
        return node;
    }
}
