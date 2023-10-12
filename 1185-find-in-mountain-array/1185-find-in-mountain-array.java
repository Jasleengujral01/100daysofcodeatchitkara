/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        // Binary search to find the peak of the mountain
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);
            if (midVal < nextVal) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int peakIndex = left;

        // Binary search on the left side of the peak
        left = 0;
        right = peakIndex;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Binary search on the right side of the peak
        left = peakIndex;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Target not found in the mountain array
    }
}
