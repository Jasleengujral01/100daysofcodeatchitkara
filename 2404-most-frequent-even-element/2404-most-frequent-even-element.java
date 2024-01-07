class Solution {
    public int mostFrequentEven(int[] array) {
        
   int mostOccurringElement = -1;
        int maxFrequency = 0;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int currentFrequency = 1;

            // Consider only even elements
            if (currentElement % 2 == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == currentElement) {
                        currentFrequency++;
                    }
                }

                if (currentFrequency > maxFrequency || 
                    (currentFrequency == maxFrequency && currentElement < mostOccurringElement)) {
                    mostOccurringElement = currentElement;
                    maxFrequency = currentFrequency;
                }
            }
        }

        return mostOccurringElement;
    }
}