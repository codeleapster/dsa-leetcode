public class LeetCode0200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]=='1') {
                    count++;
                    updateConnected(grid, i, j);
                }
            }
        }
        return count;
    }

    private void updateConnected(char[][] grid, int x, int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] == '0') {
            return;
        } else {
            grid[x][y] = '0';
            updateConnected(grid, x+1, y);
            updateConnected(grid, x, y+1);
            updateConnected(grid, x-1, y);
            updateConnected(grid, x, y-1);
        }
    }
}