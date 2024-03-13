package Leetcode;

public class l_19 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode node = head;
        while (node != null) { // for size of linkedlist
            size++;
            node = node.next;
        }
        if ((size - n) == 0) { // node at starting
            if (head.next == null) { // if (linkedlist size = 1)removalble node is head
                head = null;
                return head;
            } else if (head.next != null) { // if more than one node in linkedlist and removalble node is head
                head = head.next;
                return head;
            }
        }
        ListNode nn = head;
        ListNode cnode = nn;
        for (int i = 0; i < size - n; i++) { // if removalble node is in between then go to prev node of removalble node
            cnode = nn;
            nn = nn.next;
        }
        if (cnode.next != null) { // if removalble node is in between of linkedlist
            cnode.next = cnode.next.next;
        } else { // if removalble node is last node
            cnode.next = null;
        }
        return head;
    }
}
