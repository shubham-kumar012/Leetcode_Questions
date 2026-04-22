// Leetcode - https://leetcode.com/problems/find-common-elements-between-two-arrays/

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;

        // Method - 1(brute force)
        // T.C. - O(n*m)
        // S.C. - O(1)

        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         if(nums1[i] == nums2[j]) {
        //             res[0] = res[0]+1;
        //             j = m;
        //         }
        //     }
        // }
        // for(int i=0; i<m; i++) {
        //     for(int j=0; j<n; j++) {
        //         if(nums2[i] == nums1[j]) {
        //             res[1] = res[1]+1;
        //             j = n;
        //         }
        //     }
        // }


        // Method 2 - (Using HashMap)
        // T.C. - O(n+m)
        // S.C. - O(n+m)

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        // Filling the map with element -> freq
        for(int i=0; i<n; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0)+1);
        }
        for(int i=0; i<m; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0)+1);
        }

        // Iterate the map
        for(int key : map1.keySet()) {
            if(map2.containsKey(key)) {
                res[0] = res[0] + map1.get(key);
                res[1] = res[1] + map2.get(key);
            }
        }


        return res;
    }
}
