class Solution {
    public int tribonacci(int n) {
    if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        int[] tribonacciArray = new int[n + 1];
        tribonacciArray[0] = 0;
        tribonacciArray[1] = 1;
        tribonacciArray[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            tribonacciArray[i] = tribonacciArray[i - 1] + tribonacciArray[i - 2] + tribonacciArray[i - 3];
        }
        
        return tribonacciArray[n];
    }
}