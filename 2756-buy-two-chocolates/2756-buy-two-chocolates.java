class Solution {
    public int buyChoco(int[] prices, int money) {
        if (prices.length < 2) {
            return money;
        }
        
        int minCost = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] + prices[j] <= money) {
                    minCost = Math.min(minCost, prices[i] + prices[j]);
                }
            }
        }
        
        if (minCost == Integer.MAX_VALUE) {
            return money;
        }
        
        return money - minCost;
    }
}