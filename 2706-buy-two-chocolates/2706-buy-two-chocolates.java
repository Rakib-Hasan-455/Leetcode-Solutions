class Solution {
    public int buyChoco(int[] prices, int money) {
        int lowCost1 = Integer.MAX_VALUE, lowCost1Index = -1;
        int lowCost2 = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] <= lowCost1) {
                lowCost2 = lowCost1;
                lowCost1 = prices[i];
            } else {
                lowCost2 = Math.min(lowCost2, prices[i]);
            }
        }
        int price = money - (lowCost1+lowCost2);
        return (price >= 0) ? price: money;
    }
}