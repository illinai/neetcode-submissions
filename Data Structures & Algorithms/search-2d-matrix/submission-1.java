class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int tarRow = 0;

        while (start < m){
            if (matrix[start][n-1] == target) return true;
            if (matrix[start][0] == target) return true;

            if (matrix[start][n-1] > target && matrix[start][0] < target){
                tarRow = start;
                break;
            } else{
                start++;
            }
        }
        return bSearch(matrix, target, tarRow, 0, n-1);

    }
    public boolean bSearch(int[][] matrix, int target, int tarRow, int end1, int end2){
        int middle = (end1 + end2)/2;
        if (end1 > end2) return false;
        if (matrix[tarRow][middle] == target) return true;
        if (matrix[tarRow][middle] > target){
            return bSearch(matrix, target, tarRow, end1, middle-1);
        }
        if (matrix[tarRow][middle] < target){
            return bSearch(matrix, target, tarRow, middle+1, end2);
        }
        return false;
    }
}
