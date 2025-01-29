// Q.2570 Easy
// Leetcode - https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description

// T.C. -> O((n+m)logn(n+m))
// S.C. -> O(m+n)
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums1.length; i++) { // O(n)
            mp.put(nums1[i][0], nums1[i][1]);
        }

        for(int i=0; i<nums2.length; i++) { // O(m)
            if(mp.containsKey(nums2[i][0])) {
                mp.put(nums2[i][0], mp.get(nums2[i][0]) + nums2[i][1]);
            } else {
                mp.put(nums2[i][0], nums2[i][1]);
            }
        }

        int n = mp.size();
        int[][] res = new int[n][2];
        int i = 0;
        for(var key : mp.keySet()) {
            res[i][0] = key;
            res[i][1] = mp.get(key);
            i++;
        }

        Arrays.sort(res, Comparator.comparingInt(col -> col[0]));

        return res;
    }
}
