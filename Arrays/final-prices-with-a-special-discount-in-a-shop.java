// Time Complexity - O(n^2)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int res[] = new int[n];

        for(int i=0; i<n; i++) {
            int priceToPay = prices[i];
            int j = i+1;

            while(j < n && prices[j] > prices[i]) {
                j++;
            }

            res[i] = (j < n) ? priceToPay - prices[j] : priceToPay;
        }

        return res;
    }
}
