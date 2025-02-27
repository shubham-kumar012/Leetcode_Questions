// Q.873 Medium
// Leetcode - https://leetcode.com/problems/length-of-longest-fibonacci-subsequence

// T.C. -> O(n^3)
// S.C. -> O(n)
class Solution {

    private int solve(int j, int k, int[] arr, Map<Integer, Integer> map) {
        int target = arr[k] - arr[j];
        if(map.containsKey(target) && map.get(target) < j) {// contains i and i < j
            int i = map.get(target);
            return solve(i, j, arr, map) + 1; // +1 because add also the kth element
        }
        return 2;
    }

    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(arr[i], i);
        }

        int maxSize = 0;

        for(int j=0; j<n-1; j++) {
            for(int k=j+1; k<n; k++) {
                int length = solve(j, k, arr, map);
                if(length >= 3) {
                    maxSize = Math.max(length, maxSize);
                }
            }
        }

        return maxSize;
    }

}
