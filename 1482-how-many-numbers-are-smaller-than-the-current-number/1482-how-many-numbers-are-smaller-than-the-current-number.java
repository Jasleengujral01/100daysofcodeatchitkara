class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] count = new int[101];
        for(int n: nums){
            count[n]++;
        }
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i]==0?0:count[nums[i]-1];
        }
        return ans;
    }
}