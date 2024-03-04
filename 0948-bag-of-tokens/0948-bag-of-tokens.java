class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans=0;
        int res=0;
        int s=0;
        int e=tokens.length-1;
        while(s<=e){
            if(tokens[s]<=power){
                power-=tokens[s];
                ans++;
                res=Math.max(res,ans);
                s++;
            }
            else{
                if(ans>=1){
                    power+=tokens[e];
                    ans--;
                    e--;
                }
                else break;
            }
        }
        return res;

    }
}