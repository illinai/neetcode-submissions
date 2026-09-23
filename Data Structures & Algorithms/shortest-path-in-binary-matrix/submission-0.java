class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }

        int[][] dir = {{0, 1}, {0, -1}, 
                        {1, 0}, {-1, 0}, 
                        {1, 1}, {-1, -1}, 
                        {1, -1}, {-1, 1}};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[n][n];

        int[] one = {0, 0, 1};
        q.offer(one);
        visit[0][0] = true;

        while(!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];
            int length = cell[2];

            if (row == n-1 && col == n-1) return length;

            for (int[] d : dir) {
                int nrow = row + d[0];
                int ncol = col + d[1];
                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < n && grid[nrow][ncol] == 0 && !visit[nrow][ncol]) {
                    q.offer(new int[]{nrow, ncol, length+1});
                    visit[nrow][ncol] = true;
                }
            }
        }
        return -1;
    }
}