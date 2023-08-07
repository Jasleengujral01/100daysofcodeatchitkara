class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int fp[] = new int[n+1];
        fp[0]=1;
        fp[1]=1;
        for(int i =2;i<=n;i++){
            fp[i]=fp[i-1]+fp[i-2];
        }
        return fp[n];
    }
}