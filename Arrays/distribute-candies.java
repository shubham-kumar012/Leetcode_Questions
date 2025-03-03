// Q.575 Easy
// Leetcode - https://leetcode.com/problems/distribute-candies/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        
        Set<Integer> set = new HashSet<>();

        for(int i : candyType) {
            set.add(i);
        }

        int canEat = n / 2;

        return Math.min(canEat, set.size());
    }
}
