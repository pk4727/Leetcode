package leetcode;

public class l_21 {

    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    public l_21 merge(l_21 list1, l_21 list2) { // l_21
        Node h1 = list1.head;
        Node h2 = list2.head;
        l_21 ans = new l_21();
        while (h1 != null && h2 != null) {
            if (h1.value <= h2.value) {
                ans.insertLast(h1.value);
                h1 = h1.next;
            } else {
                ans.insertLast(h2.value);
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            ans.insertLast(h1.value);
            h1 = h1.next;
        }
        while (h2 != null) {
            ans.insertLast(h2.value);
            h2 = h2.next;
        }
        return ans;
    }

    public void mergeTwoLists(l_21 list1, l_21 list2) {
        mergee(list1.head, list2.head);
    }

    public Node mergee(Node h1, Node h2) {
        while (h1 != null && h2 != null) {
            if (h1.value <= h2.value) {
                h1.next = mergee(h1.next, h2);
                return h1;
            } else {
                h2.next = mergee(h1, h2.next);
                return h2;
            }
        }
        while (h1 != null) {
            h1.next = mergee(h1.next, h2);
            return h1;
        }
        while (h2 != null) {
            h2.next = mergee(h1, h2.next);
            return h2;
        }
        if (h1 == null) {
            return h2;
        }
        return h1;
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
    if(h1==null){
    return h2;
    }
    return h1;
    }
}

class Main {
    public static void main(String[] args) {
        l_21 list = new l_21();
        l_21 list2 = new l_21();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        // list.insertLast(9);
        // list.insertLast(11);
        list.display();

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(4);
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(8);
        list2.insertLast(10);
        list2.display();

        l_21 l = list.merge(list, list2);
        l.display();
    }
}