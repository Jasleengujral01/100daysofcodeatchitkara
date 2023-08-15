class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxstreak = 0;
        int currstreak = 0;
        for(int num:nums){
            if(num==1){
                currstreak++;
                maxstreak=Math.max(maxstreak,currstreak);
            }
            else{
                currstreak=0;
            }
        }
        return maxstreak;
    }
}