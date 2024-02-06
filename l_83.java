package leetcode;

public class l_83 {

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

    public void removeDuplicate() { // leetcode_83
        deleteDuplicates(head);
        display();
    }

    private Node deleteDuplicates(Node head) {
        if (head == null) {
            return head;
        }
        Node ans = head;
        while (head.next != null) {
            if (head.value == head.next.value) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        l_83 list = new l_83();
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(7);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(9);
        list.display();
        list.removeDuplicate();
    }
}
