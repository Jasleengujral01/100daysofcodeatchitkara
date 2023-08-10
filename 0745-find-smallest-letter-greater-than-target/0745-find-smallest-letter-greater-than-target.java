class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right=letters.length-1;
        char result=letters[0];
  while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] > target) {
                result = letters[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
}
  