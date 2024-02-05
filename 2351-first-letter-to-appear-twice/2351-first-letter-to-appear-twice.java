class Solution {
    public char repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if the current character is repeated before its second occurrence
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == currentChar) {
                    return currentChar; // Found the first repeated character
                }
            }
        }

        return '\0'; // Return a default char if no repeated character is found
    }
}
