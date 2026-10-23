class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minBuy=Integer.MAX_VALUE;

        for(int price: prices){
            int profit=price-minBuy;
            minBuy=Math.min(price, minBuy);
            maxProfit=Math.max(maxProfit, profit);
        }
return maxProfit;
        
    }
}
