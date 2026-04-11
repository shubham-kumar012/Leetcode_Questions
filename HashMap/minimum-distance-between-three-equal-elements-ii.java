// Time complexity - O(n)
// Space complexity - O(n)
// Leetcode - https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length; 

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int result = Integer.MAX_VALUE;

        // initialize arraylists
        for(int i=0; i<n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<Integer>());
        }
        
        for(int k=0; k<n; k++) {
            map.get(nums[k]).add(k);

            if(map.get(nums[k]).size() >= 3) {
                // i j k
                // 2*(k-i)
                ArrayList<Integer> al = map.get(nums[k]);
                int size = al.size();

                int i = al.get(size - 3);
                
                result = Math.min(result, (k-i));
            }
        }

        return result == Integer.MAX_VALUE ? -1 : 2*result;
    }
}
