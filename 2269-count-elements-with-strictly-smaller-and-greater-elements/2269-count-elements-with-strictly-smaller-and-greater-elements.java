class Solution {
    public int countElements(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }
        
        int count = 0;
        
        for (int num : nums) {
            if (num > minVal && num < maxVal) {
                count++;
            }
        }
        
        return count;
    }
}
    