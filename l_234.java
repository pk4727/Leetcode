package leetcode;

public class l_234 {
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
    // public boolean isPalindrome(ListNode head) {
    // ListNode temp = head;
    // String s = "";
    // while (temp != null) {
    // s += String.valueOf(temp.val);
    // temp = temp.next;
    // }
    // if (s.equals(reverseString(s))) {
    // return true;
    // }
    // return false;
    // }

    // public String reverseString(String str) {
    // char ch[] = str.toCharArray();
    // String rev = "";
    // for (int i = ch.length - 1; i >= 0; i--) {
    // rev += ch[i];
    // }
    // return rev;
    // }
    // }
    
    // class Solution {
    //     public boolean isPalindrome(ListNode head) {
    //         ListNode mid = middleNode(head);
    //         ListNode sh = reverseList(mid); // second head
    //         ListNode rh = sh; // revershed head
    //         while (head != null && sh != null) {
    //             if (head.val != sh.val) {
    //                 break;
    //             }
    //             head = head.next;
    //             sh = sh.next;
    //         }
    //         reverseList(rh);
    //         return head == null || sh == null;
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