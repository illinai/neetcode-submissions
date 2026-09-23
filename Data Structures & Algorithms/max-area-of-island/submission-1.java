class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    List<Integer> lands = new ArrayList<>();
                    int area = search(grid, i, j, lands);
                    if (map.isEmpty()) {
                        map.put(1, area);
                    } else {
                        int num = map.size()+1;
                        map.put(num, area);
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            int maxVal = Collections.max(map.values());
            return maxVal;
        }
        return 0;
    }
    public int search(int[][] grid, int i, int j, List<Integer> lands) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) {
            return 0;
        } else {
            grid[i][j] = 0;
            lands.add(1);
            search(grid, i+1, j, lands);
            search(grid, i-1, j, lands);
            search(grid, i, j+1, lands);
            search(grid, i, j-1, lands);
        }
        return lands.size();
    }
}
