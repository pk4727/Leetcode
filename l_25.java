public class l_25 {

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
    //     public ListNode reverseKGroup(ListNode head, int k) {
    //         if (k == 0 || head == null) {
    //             return head;
    //         }
    //         ListNode present = head;
    //         ListNode prev = null;
    //         int length = getLength(head);
    //         int count = length / k;
    //         while (count > 0) {
    //             ListNode last = prev;
    //             ListNode temphead = present;
    //             ListNode next = present.next;
    //             for (int i = 0; present != null && i < k; i++) {
    //                 present.next = prev;
    //                 prev = present;
    //                 present = next;
    //                 if (next != null) {
    //                     next = next.next;
    //                 }
    //             }
    //             if (last != null) {
    //                 last.next = prev;
    //             } else {
    //                 head = prev;
    //             }
    //             temphead.next = present;
    //             prev = temphead;
    //             count--;
    //         }
    //         return head;
    //     }

    //     public int getLength(ListNode head) {
    //         ListNode node = head;
    //         int length = 0;
    //         while (node != null) {
    //             length++;
    //             node = node.next;
    //         }
    //         return length;
    //     }
    // }
}