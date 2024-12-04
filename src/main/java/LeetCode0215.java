import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode0215 {
    public int usingSorting(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length - k];
    }

    public int usingHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // setting up a heap with k elements
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]); // add() or offer() can be used
        }

        // Iterate remaining elements
        // swap them with the root of the heap if they are bigger than the root
        // in min heap root will have the smallest element
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }

        return minHeap.peek();
    }

    // TODO
    public int usingCountingSort(int[] nums, int k) {
        return -1;
    }

    // TODO
    public int using3wayQuickSelect(int[] nums, int k) {
        return -1;
    }

    // fails leetcode testcase with TLE.
    public int usingQuickSelect(int[] nums, int k) {
        int targetPos = nums.length - k;
        int start = 0;
        int end = nums.length-1;
        int p = -1;

        while(p!=targetPos) {
            p = partition(nums, start, end);
            if (p < targetPos) {
                start = p+1;
            } else if(p > targetPos) {
                end = p - 1;
            }
        }
        return nums[p];
    }

    private int partition(int[] nums, int start, int end) {
        int pivotVal = nums[end];
        int position = start;

        for (int i = start; i < end; i++) {
            if(nums[i] < pivotVal) {
                swap(nums, i, position);
                position++;
            }
        }
        swap(nums, position, end);
        return position;
    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
