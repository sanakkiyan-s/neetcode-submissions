class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int res = 0;

        while (right < prices.length - 1) {

            // Price drops tomorrow, so sell today
            if (prices[right] > prices[right + 1]) {
                res += prices[right] - prices[left];

                // Tomorrow becomes the new buying point
                left = right + 1;
            }

            right++;
        }

        // If price was still increasing at the end,
        // sell on the final day
        res += prices[right] - prices[left];

        return res;
    }
}