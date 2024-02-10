class Solution {
    public int countSubstrings(String s) {
        int result = 0;
         for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(i,j,s))
                {
                    result+=1;
                }
            }
        }
        return result;
    

    }

    public boolean isPalindrome(int i,int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
