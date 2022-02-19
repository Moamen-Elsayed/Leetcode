class Solution {
    public int maxProfit(int[] prices) {
        
        
        // first approach O(n^2)
//         int maxProfit = 0;
//         for(int i=0 ; i<prices.length-1 ; i++)
//             for(int j=i+1 ; j<prices.length ; j++){
//                 maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
//             }
        
//         return maxProfit;
        
        int maxProfit = 0, curBuy=prices[0];
        for(int i=1 ; i<prices.length ; i++){
           
            if(prices[i] < curBuy)
                curBuy = prices[i];
            maxProfit = Math.max(prices[i] - curBuy, maxProfit);   
        }
        
        return maxProfit;
        
    }
}