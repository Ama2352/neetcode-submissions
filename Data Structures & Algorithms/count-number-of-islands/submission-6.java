class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;
        
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }
        
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        grid[r][c] = 0;

        int rows = grid.length, cols = grid[0].length;
        int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        for(int[] dir : dirs) {
            int dr = r + dir[0], dc = c + dir[1];
            if(dr >= 0 && dc >= 0 && dr < rows && dc < cols &&
                grid[dr][dc] == '1') {
                    dfs(grid, dr, dc);
            }
        }
    }
}
