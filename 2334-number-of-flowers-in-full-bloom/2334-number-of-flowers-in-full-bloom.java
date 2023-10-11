class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] startpoints = new int[n];
        int[] endpoints = new int[n];

        int m = people.length;
        int[] result = new int[m];

        for(int i = 0; i < n; i++){
            startpoints[i] = flowers[i][0];
            endpoints[i] = flowers[i][1];
        }

        Arrays.sort(startpoints);
        Arrays.sort(endpoints);

        for(int i = 0; i < m; i++){
            int x = binarySearch(startpoints, people[i] + 1);
            int y = binarySearch(endpoints, people[i]);
            result[i] = x - y;
        }

        return result;
    }

    private int binarySearch(int[] array, int target){
        int result = array.length;
        int left = 0, right = array.length - 1;

        while(left <= right){
            int mid = (left + right) >> 1;
            if(array[mid] >= target){
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}