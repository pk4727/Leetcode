package leetcode;

import java.util.Stack;

public class l_84 {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }
        return max;
    }

    private int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }

    public int largestRectangleArea1(int[] heights) { // l_84
        if (heights.length == 1) {
            return heights[0];
        }
        int[] prevMin = prevMinIndex(heights);
        int[] nextMin = nextMinIndex(heights);
        // System.out.println(Arrays.toString(prevMin));
        // System.out.println(Arrays.toString(nextMin));
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentArea = ((nextMin[i] - prevMin[i]) - 1) * heights[i];
            if (area < currentArea) {
                area = currentArea;
            }
        }
        return area;
    }

    private int[] prevMinIndex(int[] heights) {
        int[] prevMin = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                prevMin[i] = -1;
            } else {
                prevMin[i] = s.peek();
            }
            s.push(i);
        }
        return prevMin;
    }

    private int[] nextMinIndex(int[] heights) {
        int[] prevMin = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] <= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                prevMin[i] = heights.length;
            } else {
                prevMin[i] = s.peek();
            }
            s.push(i);
        }
        return prevMin;
    }

    public int largestRectangleArea2(int[] heights) { // time excced
        if (heights.length == 1) {
            return heights[0];
        }
        int[] prevMin = new int[heights.length];
        int[] nextMin = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            prevMin[i] = prevMinIndex(heights, i);
            nextMin[i] = nextMinIndex(heights, i);
        }
        // System.out.println(Arrays.toString(prevMin));
        // System.out.println(Arrays.toString(nextMin));
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int currentArea = ((nextMin[i] - prevMin[i]) - 1) * heights[i];
            if (area < currentArea) {
                area = currentArea;
            }
        }
        return area;
    }

    private int prevMinIndex(int[] list, int index) {
        int minindex = index;
        for (int i = index; i >= 0; i--) {
            if (list[i] < list[index] && list[i] < list[minindex]) {
                return i;
            }
        }
        if (list[minindex] == list[index]) {
            minindex = -1;
        }
        return minindex;
    }

    private int nextMinIndex(int[] list, int index) {
        int minindex = index;
        for (int i = index; i < list.length; i++) {
            if (list[i] < list[index] && list[i] < list[minindex]) {
                return i;
            }
        }
        if (list[minindex] == list[index]) {
            minindex = list.length;
        }
        return minindex;
    }

}

class run {
    public static void main(String[] args) {
        l_84 lr = new l_84();
        // int[] rec = {2,1,5,6,2,3};
        int[] rec = { 1, 1 };
        System.out.println(lr.largestRectangleArea(rec)); // perfect
        System.out.println(lr.largestRectangleArea1(rec));
        System.out.println(lr.largestRectangleArea2(rec));
    }
}
