package FunctionalProgramming.NumberOfIslands;

public class NumberOfIslands {
    @SuppressWarnings("null")
    public int numIslands(char[][] grid) {
        if (grid == null && grid.length == 0) {
            return 0;
        }
        int numberOfIslands = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we find a '1', it means we found a new island
                if (grid[i][j] == '1') {
                    numberOfIslands++;
                    // Perform DFS to mark all parts of this island as visited
                    dfs(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
            System.out.println("Return in If" + "i: " + i + " j: " + j);
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }

    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();

        char[][] grid1 = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        System.out.println(solution.numIslands(grid1)); // Output: 1

    }
}
