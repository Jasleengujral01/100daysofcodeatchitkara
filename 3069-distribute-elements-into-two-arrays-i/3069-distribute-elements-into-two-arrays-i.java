class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
                l1.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }
        }
        int[] ans = new int[n];
        for(int i=0;i<l1.size();i++){
             ans[i] = l1.get(i);
        }
        int b = l1.size();
        for(int i=0;i<l2.size();i++){
             ans[b] = l2.get(i);
            b++;
        }
        
        return ans;
    }
}