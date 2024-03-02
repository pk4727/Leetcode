package leetcode;

public class l_143 {
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
    // class Solution {
    //     public void reorderList(ListNode head) {
    //         if (head == null && head.next == null) {
    //             return;
    //         }
    //         ListNode firsthead = head;
    //         ListNode mid = middleNode(head);
    //         ListNode secondhead = reverseList(mid);

    //         while (firsthead != null && secondhead != null) {
    //             ListNode temp = firsthead.next;
    //             firsthead.next = secondhead;
    //             firsthead = temp;

    //             temp = secondhead.next;
    //             secondhead.next = firsthead;
    //             secondhead = temp;
    //         }
    //         if (firsthead != null) {
    //             firsthead.next = null;
    //         }
    //     }

    //     public ListNode middleNode(ListNode head) {
    //         ListNode s = head;
    //         ListNode f = head;

    //         while (f != null && f.next != null) {
    //             s = s.next;
    //             f = f.next.next;
    //         }
    //         return s;
    //     }

    //     public ListNode reverseList(ListNode head) {
    //         if (head == null) {
    //             return head;
    //         }
    //         ListNode prev = null;
    //         ListNode present = head;
    //         ListNode next = present.next;

    //         while (present != null) {
    //             present.next = prev;
    //             prev = present;
    //             present = next;
    //             if (next != null) {
    //                 next = next.next;
    //             }
    //         }
    //         return prev;
    //     }
    // }
}
