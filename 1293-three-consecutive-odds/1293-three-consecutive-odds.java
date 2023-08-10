class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
     int consecutiveCount = 0;

        for (int num : arr) {
            if (num % 2 == 1) {  // Check if the number is odd
                consecutiveCount++;
                if (consecutiveCount == 3) {
                    return true;
                }
            } else {
                consecutiveCount = 0;
            }
        }

        return false;
    }
}