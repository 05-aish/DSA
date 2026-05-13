class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buy_at = prices[0]
        for i in range(len(prices)):
            if buy_at >= prices[i]:
                buy_at = prices[i]
            elif (prices[i] - buy_at) > profit:
                profit = prices[i] - buy_at
        
        return profit