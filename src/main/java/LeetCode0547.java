import java.util.*;

public class LeetCode0547 {

    public int approachTwo(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }


    // Beginner approach
    public int approachOne(int[][] isConnected) {
        Map<Integer, List<Integer>> graph = makeGraph(isConnected);
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                dfs(graph, i, visited);
                provinces++;
            }
        }
        return provinces;
    }

    private void dfs(Map<Integer, List<Integer>> graph, int i, boolean[] visited) {
        visited[i] = true;
        List<Integer> neighbors = graph.get(i);

        for (Integer neighbor : neighbors) {
            if(!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    private Map<Integer, List<Integer>> makeGraph(int[][] isConnected) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<isConnected.length; i++) {
            if(!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for(int j=0; j<isConnected[i].length; j++) {
                if(isConnected[i][j] == 1 && i != j) {
                    graph.get(i).add(j);
                }
            }
        }
        System.out.println("graph = " + graph);
        return graph;
    }

}