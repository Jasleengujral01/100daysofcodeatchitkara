#include <vector>
#include <algorithm>
#include <unordered_set>

class Solution {
public:
    bool uniqueOccurrences(std::vector<int>& arr) {
        std::sort(arr.begin(), arr.end());

        std::unordered_set<int> uniqueCounts;
        int count = 1;
        int n = arr.size();

        for (int i = 1; i < n; ++i) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (!uniqueCounts.insert(count).second) {
                    return false;
                }
                count = 1;
            }
        }

        // Check the count for the last element in the array
        return uniqueCounts.insert(count).second;
    }
};
