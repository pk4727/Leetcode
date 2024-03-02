package leetcode;

import java.util.Stack;

public class l_232 {
    public class MyQueue {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public MyQueue() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void push(int x) {
            first.push(x);
        }

        public int pop() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int removed = second.pop();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            int peek = second.peek();
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
            return peek;
        }

        public boolean empty() {
            return first.isEmpty();
        }
    }

    public static void main(String[] args) {
        l_232 outerObject = new l_232();
        l_232.MyQueue obj = outerObject.new MyQueue();
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
}
