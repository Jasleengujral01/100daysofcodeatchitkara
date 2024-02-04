class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Shift elements to the right to make space for the new element
            for (int j = n - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            // Insert the new element at the specified index
            target[index[i]] = nums[i];
        }
        
        return target;
    }
}
