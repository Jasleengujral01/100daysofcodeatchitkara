class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Reverse each row to complete the rotation
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }
    
    private void reverseRow(int[] row) {
        int left = 0;
        int right = row.length - 1;
        
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            
            left++;
            right--;
        }
    }
}
