import java.util.LinkedList;
import java.util.Queue;

public class LeetCode0993 {

}

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t-3000) {
            queue.poll();
        }
        return queue.size();
    }
}

class RecentCounter1 {
    private static final int[] records = new int[10000]; //
    private int start;
    private int end;

    public RecentCounter1() {
        start = 0;
        end = 0;
    }

    public int ping(int t) {
        while (start < end && (t - records[start] > 3000)) {
            start++; // if the difference in time is greater than 3000ms,
            // than increase the value of start unitl it's equal or less than 3000ms.
        }
        records[end++] = t; // Inserting the current time at the end
        return end - start; // Returning the answer including the element added just now.
    }
}