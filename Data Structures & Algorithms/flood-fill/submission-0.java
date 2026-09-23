class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c = image[sr][sc];
        if (c == color) { 
            return image;
        } else {
            return dfs(image, sr, sc, c, color);
        }
    }

    public int[][] dfs(int[][] image, int sr, int sc, int startColor, int color) {
        int n = image.length;
        int m = image[0].length;
        if (sr < 0 || sr >= n || sc < 0 || sc >= m || image[sr][sc] != startColor) {
            return image;
        } else {
            image[sr][sc] = color;
            dfs(image, sr+1, sc, startColor, color);
            dfs(image, sr-1, sc, startColor, color);
            dfs(image, sr, sc+1, startColor, color);
            dfs(image, sr, sc-1, startColor, color);
        }
        return image;
    }
}