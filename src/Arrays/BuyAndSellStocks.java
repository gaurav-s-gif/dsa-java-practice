// Problem: 121. Best Time to Buy and Sell Stock
// Platform: LeetCode
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach:
//   - Track the minimum stock price so far (minPrice)
//   - For each price, calculate today's profit: price - minPrice
//   - Update maxProfit whenever a larger profit is found
//   - Update minPrice if a new lower price appears
//   - Single pass solution (Kadane-like approach for profits)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class BuyAndSellStocks {
    public static int bestTime(int[] prices){
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int result=bestTime(prices);
        System.out.println(result);
    }
}
