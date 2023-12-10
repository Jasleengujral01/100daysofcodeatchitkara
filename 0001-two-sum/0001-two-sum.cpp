#include <vector>
#include <algorithm>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::vector<int> result;

        // Create a sorted copy of the input array
        std::vector<int> sortedNums = nums;
        std::sort(sortedNums.begin(), sortedNums.end());

        // Use two pointers to find the pair that sums up to the target
        int left = 0;
        int right = sortedNums.size() - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];

            if (sum == target) {
                // Find the indices of the pair in the original array
                for (int i = 0; i < nums.size(); i++) {
                    if (nums[i] == sortedNums[left] || nums[i] == sortedNums[right]) {
                        result.push_back(i);
                    }
                }
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
};
