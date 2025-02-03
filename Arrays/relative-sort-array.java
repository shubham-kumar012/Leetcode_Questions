// Q.1122 Easy
// Leetcode - https://leetcode.com/problems/relative-sort-array/

// T.C. -> O(n+m)
// S.C. -> O(1)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int res[] = new int[arr1.length];
        int[] freq = new int[1001]; 
        // count frequency of arr1
        for(int i=0; i<arr1.length; i++) {
            freq[arr1[i]]++;
        }

        // sort as the order of arr2
        int idx = 0; // index for res array
        for(int i=0; i<arr2.length; i++) {
            while(freq[arr2[i]] != 0) {
                arr1[idx] = arr2[i];
                idx++; 
                freq[arr2[i]]--;
            }
        }

        // adding rest of remaining elements in sorted order
        for(int i=0; i<1001; i++) {
            while(freq[i] > 0) {
                arr1[idx] = i;
                idx++;
                freq[i]--;
            }
        }

        return arr1;

    }
}
