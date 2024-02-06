package leetcode;

public class l_876 {
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
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode temp = head;
            int length = 1;

            while (slow.next != null) {
                length += 1;
                slow = slow.next;
            }
            System.out.println(length);
            int middle = (length / 2);

            while (middle != 0) {
                temp = temp.next;
                middle--;
            }
            return temp;
        }
    }

    class Solution2 {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}