// Q.2657 Medium 
// Leetcode - https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // Method 1 - Brute Force - O(n^3)
        // int n = A.length;
        // int[] C = new int[n];

        // for(int i = 0; i < n; i++) {
        //     int count = 0; 
        //     for(int j = 0; j <= i; j++) {
        //         for(int k = 0; k <= i; k++) {
        //             if(A[j] == B[k]) {
        //                 count++;
        //                 break;
        //             }
        //         }
        //     }
        //     C[i] = count;
        // }
        // return C;


        // Method 2 - Using Addition Boolean Arrays - O(n^2)
        int n = A.length;
        int[] C = new int[n];
        Boolean[] isPresentA = new Boolean[n+1];
        Boolean[] isPresentB = new Boolean[n+1];
        Arrays.fill(isPresentA, false);
        Arrays.fill(isPresentB, false);

        for(int i = 0; i < n; i++) {
            isPresentA[A[i]] = true;
            isPresentB[B[i]] = true;
            int count = 0;
            for(int j = 1; j < isPresentA.length; j++) {
                if(isPresentA[j] & isPresentB[j]) {
                    count++;
                }
            }
            C[i] = count;
        }
        return C;

    }
}
