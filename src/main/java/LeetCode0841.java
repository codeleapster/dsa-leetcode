import java.util.*;

public class LeetCode0841 {
    public boolean approachDfs(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] visited = new boolean[n];
        visited[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0); // add() is same as push(). Using add to keep it consistent with queue data structure

        while(!keys.isEmpty()) {
            int currentKey = keys.pop();
            visited[currentKey] = true;

            List<Integer> newKeys = rooms.get(currentKey);
            for(int newKey: newKeys) {
                if(!visited[newKey]) {
                    keys.add(newKey);
                }
            }
        }
        return isAllTrue(visited);
    }

    public boolean approachDfsOptimized(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);
        int count = 1;
        while(!keys.isEmpty()) {
            for(int newKey: rooms.get(keys.pop())) {
                if(!visited[newKey]) {
                    keys.add(newKey);
                    visited[newKey] = true;
                    count++;
                }
            }
        }
        return count == rooms.size();
    }

    public boolean approachBfs(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> keys = new LinkedList<>();
        keys.add(0);

        while(!keys.isEmpty()) {
            int key = keys.poll();
            if(!visited.contains(key)) {
                keys.addAll(rooms.get(key));
                visited.add(key);
            }
        }

        return visited.size() == rooms.size();
    }

    private static boolean isAllTrue(boolean[] visited) {
        // System.out.println(Arrays.toString(visited));
        for(boolean flag: visited) {
            if(!flag) {
                return false;
            }
        }
        return true;
    }
}