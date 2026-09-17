class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows, cols = len(grid), len(grid[0])
        islands = 0

        def dfs(grid: List[List[str]], r: int, c: int):
            grid[r][c] = '0'

            dirs = [[0, -1], [0, 1], [-1, 0], [1, 0]]

            rows, cols = len(grid), len(grid[0])

            for dir in dirs:
                dr = r + dir[0] 
                dc = c + dir[1]
                if dr >= 0 and dc >= 0 and dr < rows and dc < cols and grid[dr][dc] == '1':
                    dfs(grid, dr, dc)

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == '1':
                    islands += 1
                    dfs(grid, r, c)
    
        return islands

     

