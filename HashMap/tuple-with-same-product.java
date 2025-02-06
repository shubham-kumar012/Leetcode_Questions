// Q.1726 Medium
// Leetcode - https://leetcode.com/problems/tuple-with-same-product/description

// T.C. -> O(n^2)
// S.C. -> O(n^2)
class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        // Map to store the product of every pair prod
        HashMap<Integer, Integer> productMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int prod = nums[i] * nums[j];
                // store prod in map with its freq
                productMap.put(prod, productMap.getOrDefault(prod, 0)+1);
            }
        }
        int ans = 0;
        // iterate our Map
        for(var entry : productMap.entrySet()) {
            int prod = entry.getKey();
            int count = entry.getValue();
            if(count >= 2) {
                int comb = (count * (count-1))/2;
                ans = ans + comb*8;
            }
        }
        return ans;
    }
}
