class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        StringBuilder mergedString = new StringBuilder();
        int maxLength = Math.max(word1Array.length, word2Array.length);
         for (int i = 0; i < maxLength; i++) {
            if (i < word1Array.length) {
                mergedString.append(word1Array[i]);
            }
            if (i < word2Array.length) {
                mergedString.append(word2Array[i]);
            }
        }
        return mergedString.toString();
    }
}