class Solution {
    public int arraySign(int[] nums) {
        int product = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0; // If any element is 0, the product will be 0
            } else if (num < 0) {
                product *= -1; // If the element is negative, multiply the product by -1
            }
        }

        return product;
    }
}
