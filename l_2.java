package leetcode;

public class l_2 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// import java.math.BigInteger;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode n1 = l1;
//         ListNode n2 = l2;
//         String l1digits = "";
//         String l2digits = "";
//         while (n1 != null) {
//             l1digits += String.valueOf(n1.val);
//             n1 = n1.next;
//         }
//         while (n2 != null) {
//             l2digits += String.valueOf(n2.val);
//             n2 = n2.next;
//         }
//         l1digits = reverseString(l1digits);
//         l2digits = reverseString(l2digits);
//         BigInteger bd1 = new BigInteger(l1digits);
//         BigInteger bd2 = new BigInteger(l2digits);
//         BigInteger sum_n1_n2 = bd1.add(bd2);
//         String ans = String.valueOf(sum_n1_n2);
//         ans = reverseString(ans);

//         char ans1 = (char) (ans.charAt(0) - '0');
//         ans = ans.substring(1);
//         ListNode anslist = new ListNode(ans1);
//         ListNode currentNode = anslist;
//         while (!ans.isEmpty()) {
//             char c = (char) (ans.charAt(0) - '0');
//             ListNode node = new ListNode(c);
//             currentNode.next = node;
//             currentNode = node;
//             ans = ans.substring(1);
//         }
//         return anslist;
//     }

//     public String reverseString(String str) {
//         char ch[] = str.toCharArray();
//         String rev = "";
//         for (int i = ch.length - 1; i >= 0; i--) {
//             rev += ch[i];
//         }
//         return rev;
//     }
// }
}