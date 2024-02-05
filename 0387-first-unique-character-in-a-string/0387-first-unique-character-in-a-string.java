class Solution {
    public int firstUniqChar(String s) {
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            boolean isUnique = true;
            for(int j=0;j<charArray.length;j++){
             if(i!=j &&charArray[i]==charArray[j]){
                isUnique = false;
                    break;
             }
        }
        
        if (isUnique){
            return i;
        }
        
        }
        
            return -1;
        
    }
}