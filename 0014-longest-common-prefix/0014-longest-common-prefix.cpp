#include <vector>
#include <string>

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) {
            return ""; // If the input vector is empty, there is no common prefix
        }

        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].size(); ++i) {
            // Check if the current character matches in all strings
            for (int j = 1; j < strs.size(); ++j) {
                if (i >= strs[j].size() || strs[j][i] != strs[0][i]) {
                    // If the current index is out of bounds for the current string
                    // or the character doesn't match, return the prefix up to this point
                    return strs[0].substr(0, i);
                }
            }
        }

        // If we reach here, the entire first string is a common prefix
        return strs[0];
    }
};
