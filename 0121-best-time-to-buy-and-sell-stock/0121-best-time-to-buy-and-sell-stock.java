class Solution {
    public int maxProfit(int[] prices) {
        int leftMin = prices[0], maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(leftMin > prices[i]) {
                leftMin = prices[i];
            }
            if((prices[i] - leftMin) > maxProfit) {
                maxProfit = prices[i] - leftMin;
            }
        }
        return maxProfit;
    }
}