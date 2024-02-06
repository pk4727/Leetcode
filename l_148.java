package leetcode;

public class l_148 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode mid = getMid(head);
            ListNode left = sortList(head);
            ListNode right = sortList(mid);
            return mergeTwoLists(left, right);
        }

        ListNode getMid(ListNode head) {
            ListNode midPrev = null;
            while (head != null && head.next != null) {
                midPrev = (midPrev == null) ? head : midPrev.next;
                head = head.next.next;
            }
            ListNode mid = midPrev.next;
            midPrev.next = null;
            return mid;
        }

        public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
            while (h1 != null && h2 != null) {
                if (h1.val <= h2.val) {
                    h1.next = mergeTwoLists(h1.next, h2);
                    return h1;
                } else {
                    h2.next = mergeTwoLists(h1, h2.next);
                    return h2;
                }
            }
            while (h1 != null) {
                h1.next = mergeTwoLists(h1.next, h2);
                return h1;
            }
            while (h2 != null) {
                h2.next = mergeTwoLists(h1, h2.next);
                return h2;
            }
            if (h1 == null) {
                return h2;
            }
            return h1;
        }
    }

    private void sortList(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = getReferanceOfNode(col);
            Node second = getReferanceOfNode(col + 1);
            if (first.value > second.value) {
                if (first == head) { // col in start
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) { // col in end
                    Node prev = getReferanceOfNode(col - 1);
                    prev.next = second;
                    tail = first;
                    second.next = tail;
                    first.next = null;
                } else { // col not in start and end
                    Node prev = getReferanceOfNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            } else {
                sortList(row, col + 1);
            }
            sortList(row - 1, 0);
        }
    }
}
