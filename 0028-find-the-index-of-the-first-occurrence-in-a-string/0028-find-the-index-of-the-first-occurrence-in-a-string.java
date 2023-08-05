class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        char[] heyArray = haystack.toCharArray(); 
        char[] noArray = needle.toCharArray(); 
         for (int i = 0; i <= heyArray.length - noArray.length; i++) {
             boolean found = true;
            for (int j = 0; j < noArray.length; j++) {
                  if (heyArray[i + j] != noArray[j]) {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                return i;
            }
        }
    return -1;
}
}