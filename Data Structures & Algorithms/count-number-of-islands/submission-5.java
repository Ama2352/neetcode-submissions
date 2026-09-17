class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;
        boolean[][] visited = new boolean[rows][cols];

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1' && !visited[r][c]) {
                    count++;
                    dfs(grid, visited, r, c);
                }
            }
        }

        return count;

    }

    private void dfs(char[][] grid, boolean[][] visited, int r, int c) {
        visited[r][c] = true;

        int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int rows = grid.length; int cols = grid[0].length;

        for(int[] dir : dirs) {
            int dr = r + dir[0], dc = c + dir[1];
            if(dr >= 0 && dr < rows && dc >= 0 && dc < cols
                && grid[dr][dc] == '1' && !visited[dr][dc]) {
                dfs(grid, visited, dr, dc);
            }
        }
    }
}
