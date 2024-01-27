class Solution {
    public int[] leftRightDifference(int[] nums) {
       int n = nums.length;
      
       int[] left_arr = new int[n];
        int left_sum = 0;
        left_arr[0] = left_sum;
       for(int i=0; i<n-1; i++){
           left_sum += nums[i];
           left_arr[i+1] = left_sum;
       } 

       int[] right_arr = new int[n];
       int right_sum = 0;
       right_arr[n-1] = right_sum;
       for(int i=n-1; i>=1; i--){
           right_sum += nums[i];
           right_arr[i-1] = right_sum;
       }

       int[] answer = new int[n];
       for(int i=0;i<n;i++){
       answer[i] = Math.abs(left_arr[i]- right_arr[i]);
       }
       return answer;
    }
}