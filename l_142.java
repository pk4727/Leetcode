package leetcode;

public class l_142 {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// public class Solution {
//     public ListNode detectCycle(ListNode head) {
    
//         int length = CycleElementCount(head);
//         if(length==0){
//             return null;
//         }
//         ListNode f = head;
//         ListNode s = head;
//         while (length > 0) {
//             s = s.next;
//             length--;
//         }
//         while (f != s) {
//             f = f.next;
//             s = s.next;
//         }
//         return s;
//     }
    
//     public int CycleElementCount(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if (slow == fast) {
//                 int count = 1;
//                 ListNode temp = slow.next;
//                 while (temp != slow) {
//                     count++;
//                     temp = temp.next;
//                 }
//                 return count;
//             }
//         }
//         return 0;
//     }
// }
