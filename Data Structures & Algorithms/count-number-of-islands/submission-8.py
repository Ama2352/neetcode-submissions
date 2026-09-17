class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows, cols = len(grid), len(grid[0])
        islands = 0

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1":
                    islands += 1
                    self.bfs(grid, r, c)

        return islands

    def bfs(self, grid, r, c):
        rows, cols = len(grid), len(grid[0])

        q = deque()
        q.append((r, c))

        grid[r][c] = "0"

        dirs = [(0, -1), (0, 1), (-1, 0), (1, 0)]

        while q:
            r, c = q.popleft()

            for dr, dc in dirs:
                nr = r + dr
                nc = c + dc

                if(nr >= 0 and nc >= 0 and nr < rows and nc < cols
                    and grid[nr][nc] == "1"):
                    q.append((nr, nc))
                    grid[nr][nc] = "0"
