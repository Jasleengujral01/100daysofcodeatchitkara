class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            // Check if the current point lies on the same line as the first two points
            if ((y1 - y0) * (xi - x0) != (yi - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }
}
