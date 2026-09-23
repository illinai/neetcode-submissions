class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null) return 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    List<Integer> cords = new ArrayList<>();
                    search(grid, i, j, cords);
                    if (map.isEmpty()) {
                        map.put(1, cords);
                    } else {
                        int num = map.size()+1;
                        map.put(num, cords);
                    }
                }
            }
        }
        return map.size();

    }
    public List<Integer> search(char[][] grid, int i, int j, List<Integer> cords) {
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0' || grid[i][j] == '2'){
            return null;
        } else {
            grid[i][j] = '2';
            cords.add(i);
            cords.add(j);
            search(grid, i+1, j, cords);
            search(grid, i-1, j, cords);
            search(grid, i, j+1, cords);
            search(grid, i, j-1, cords);
        }
        return cords;
    }
}
