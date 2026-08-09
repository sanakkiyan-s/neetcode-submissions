class Solution {
    public int maxProfit(int[] prices) {
        int right= 1;
        int res=0;

        while (right<prices.length){
            if(prices[right]>prices[right-1]){
                res+=prices[right]-prices[right-1];

            }
            right++;
        }
        return res;
    }
}