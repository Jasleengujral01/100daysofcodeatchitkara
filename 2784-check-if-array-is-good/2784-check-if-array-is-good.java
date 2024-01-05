class Solution {
    public boolean isGood(int[] nums) {
         if (nums.length < 2) {
            return false;  
        }
        Arrays.sort(nums);
        int n = nums.length-1;
        if(n==nums[nums.length-1]){
           if(nums[nums.length-1]==nums[nums.length-2]){
               for(int i=0;i<nums.length-2;i++){
                   if(nums[i]==nums[i+1]){
                       return false;
                   }
               }
           
               return true;
           }
           }
           return false;
    }
}