// Time complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;

        int res = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) == key) {
                res = Math.max(res, key);
            }
        }

        return res == Integer.MIN_VALUE ? -1 : res;
    }
}
