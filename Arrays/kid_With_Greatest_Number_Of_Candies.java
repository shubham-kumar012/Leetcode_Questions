// Q.1431 Easy
// Leetcode - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();
        // Find maximum candy having kid
        int maxCandyKid = 0;
        for(int i=0; i<n; i++) {
            maxCandyKid = Math.max(maxCandyKid, candies[i]);
        }
        // Filling the answer
        for(int i=0; i<n; i++) {
            if((candies[i]+extraCandies) >= maxCandyKid) {
                res.add(true);
            }
            else {
                res.add(true);
            }
        }
        return res;
    }
}
