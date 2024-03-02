package leetcode;

public class l_116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    private Node Nroot;

    public void Ninsert(int value) {
        Nroot = Ninsert(Nroot, value);
    }

    private Node Ninsert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (node.val > value) {
            node.left = Ninsert(node.left, value);
        }
        if (node.val < value) {
            node.right = Ninsert(node.right, value);
        }
        return node;
    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftmost = root;
        while (leftmost.left != null) {
            Node current = leftmost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
}