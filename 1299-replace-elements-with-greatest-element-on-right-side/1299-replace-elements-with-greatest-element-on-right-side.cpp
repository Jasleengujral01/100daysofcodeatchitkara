class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size();
        int maxRight=-1;
        vector<int> nums(n);
        
        for(int i=n-1;i>=0;--i){
            nums[i]=maxRight;
            maxRight=max(arr[i],maxRight);
           
        }
        return nums;
    }
};