// class Solution {
//     public int maxProfit(int[] prices) {
//         int profit = 0;
//         for(int i = 1; i < prices.length; i++){
//             if (prices[i] > prices[i - 1]){
//                 profit += prices[i] - prices[i - 1];
//             }
//         }
//         return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int currday = 1; currday < prices.length; currday++){
            int dailyprofit =  prices[currday] - prices[currday-1];
            maxProfit += Math.max(0, dailyprofit);
        }
        return maxProfit;
    }
}