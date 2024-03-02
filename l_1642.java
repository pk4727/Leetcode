package leetcode;

import java.util.PriorityQueue;

public class l_1642 {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                heap.offer(diff);
                if (heap.size() > ladders) {
                    bricks -= heap.poll();
                }
                if (bricks < 0) {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 6, 9, 14, 12 };
        System.out.println(furthestBuilding(arr, 5, 1));
    }
}
