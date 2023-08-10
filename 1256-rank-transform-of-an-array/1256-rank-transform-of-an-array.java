class Solution {
    public int[] arrayRankTransform(int[] arr) {
         int n = arr.length;
        int[] sortedArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArr);
        
        int[] ranks = new int[n];
        int rank = 1;
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && sortedArr[i] != sortedArr[i - 1]) {
                rank++;
            }
            ranks[i] = rank;
        }
        
        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(sortedArr, arr[i]);
            arr[i] = ranks[index];
        }
        
        return arr;
    }
}
   