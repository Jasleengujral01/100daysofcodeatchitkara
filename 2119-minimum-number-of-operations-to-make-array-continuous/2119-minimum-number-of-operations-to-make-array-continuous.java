class Solution {
    public int minOperations(int[] n) {
        Arrays.sort(n);
        int unqL = 1;
        for(int i=1;i<n.length;i++)
        {
            if(n[i]!=n[i-1])
                n[unqL++] = n[i];
        }

        int res = n.length;
        for(int i=0,j=0;i<unqL;++i)
        {
            while(j<unqL && n[j] - n[i] <= n.length-1)
                ++j;
            res = Math.min(res, n.length - (j-i));
        }
        return res;
    }
}