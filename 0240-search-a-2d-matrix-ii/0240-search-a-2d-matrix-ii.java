class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int cols = 0;
        while (rows >= 0 && cols < matrix[0].length) {
            if (matrix[rows][cols] == target) {
                return true;
            } else if (target < matrix[rows][cols]) {
                rows--;
            } else {
                cols++; // Adjust cols by incrementing, not decrementing
            }
        }
        return false;
    }
}
