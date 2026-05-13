// Leetcode - https://leetcode.com/problems/number-of-equivalent-domino-pairs/

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;

        // Method 1 : O(n^2)
        // for(int i=0; i<n; i++) {
        //     int[] dom1 = dominoes[i];
        //     for(int j=i+1; j<n; j++) {
        //         int[] dom2 = dominoes[j];
        //         if(dom1[0] == dom2[0] && dom1[1] == dom2[1]) {
        //             count++;
        //         } else if(dom1[0] == dom2[1] && dom1[1] == dom2[0]) {
        //             count++;
        //         }

        //     }
        // }




        // Method 2 : O(n)
        
        int[] map = new int[100];

        for(int[] d : dominoes) {
            if(d[0] > d[1]) {
                map[d[0] * 10 + d[1]]++;
            } else {
                map[d[1] * 10 + d[0]]++;
            }
        }

        for(int freq : map) {
            count += (freq - 1) * freq / 2;
        }

        return count;
    }
}
