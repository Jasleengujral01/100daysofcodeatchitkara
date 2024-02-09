import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > maxLen) {
                        maxLen = dp[i];
                        maxIdx = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int currLen = maxLen;
        int currIdx = maxIdx;
        int currVal = nums[currIdx];
        for (int i = maxIdx; i >= 0; i--) {
            if (currVal % nums[i] == 0 && dp[i] == currLen) {
                result.add(nums[i]);
                currVal = nums[i];
                currLen--;
            }
        }

        return result;
    }
}
