class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end =-1;
        int left = 0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if(start==-1){
            return new int[]{-1,-1};
        }
        left=start;
        right=nums.length-1;
        while(left<=right){
         int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                end = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{start, end};
    }
}