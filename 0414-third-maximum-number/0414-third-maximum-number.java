import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) {
            return nums[nums.length - 1];
        }
        int uniqueCount = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                uniqueCount++;
                if (uniqueCount == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
