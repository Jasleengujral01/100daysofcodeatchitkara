class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         String[] words = text.split(" ");
        int count = words.length;
        
        for (String word : words) {
            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    count--;
                    break;
                }
            }
        }
        
        return count;
    }
}