class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1 ) return 0;

        return dfs(0, 0, m, n, obstacleGrid, dp);
    }
    public int dfs(int i, int j, int m, int n, int[][] grid, int[][] dp) {
        if (i == m-1 && j == n-1) {
            return 1;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1) {
            return 0;
        } 
        if (dp[i][j] != -1) {
            return dp[i][j];
        } 
        dp[i][j] = dfs(i+1, j, m, n, grid, dp) + dfs(i, j+1, m, n, grid, dp);
        return dp[i][j];


    }
}