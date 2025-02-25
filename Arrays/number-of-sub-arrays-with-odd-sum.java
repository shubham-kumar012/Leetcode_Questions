// Q.1524 Medium
// Leetcode - https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public int numOfSubarrays(int[] arr) {
        int M = 1000000007;
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        
        for(int i = 1; i < n; i++) {
            prefix[i] = arr[i] + prefix[i-1];
        }

        int count = 0;
        int oddCount = 0;
        int evenCount = 1;

        for(int i=0; i < n; i++) {
            if(prefix[i]%2 == 0) { // even + odd -> odd
                count = (count + oddCount) % M;
                evenCount++;
            } else {
                count = (count + evenCount) % M;
                oddCount++;
            }
        }

        return count;
    }
}
