class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1; // Count of unique elements
        int current = 1; // Pointer to track the current position for unique elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[current] = nums[i];
                uniqueCount++;
                current++;
            }
        }
        
        return uniqueCount;
    }
}
