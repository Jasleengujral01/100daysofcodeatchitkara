class Solution {
    public int countElements(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
          boolean hassmaller=false;
          boolean hasbigger= false;
          for(int j=0;j<nums.length;j++){
            if(i!=j){
              if(nums[j]>nums[i]){
                hasbigger =true;
              }
              if(nums[j]<nums[i]){
                hassmaller=true;
              }
            }
          }
          if(hassmaller&hasbigger){
            count++;
          }
        }
      return count;
    }
}