// Time Complexity - O(n * m)
// Space Complexity - O(m)
// Leetcode - https://leetcode.com/problems/points-that-intersect-with-cars/

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> res = new HashSet<>();

        for(int i=0; i<nums.size(); i++) {
            List<Integer> pos = nums.get(i);
            for(int j=pos.get(0); j<=pos.get(1); j++) {
                res.add(j);
            }
        }

        return res.size();
    }
}
