class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int tempProfit = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[leftPointer] < prices[rightPointer]) {
                tempProfit = prices[rightPointer] - prices[leftPointer];
                maxProfit = Math.max(maxProfit, tempProfit);
            }
            else {
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        return maxProfit;
        
    }
}