// Q.1486 Easy
 

// First Method
//T.C. -> O(n)
//S.C. -> O(n)
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = start + 2 * i;
        }
        int res = nums[0];
        for(int i=1; i<n; i++) {
            res ^= nums[i];
        }
        return res;
    }
}


// Second Method
// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int xorOperation(int n, int start) {
        int res = start + 2 * 0;
        for(int i=1; i<n; i++) {
            res ^= (start + 2 * i);
        }
        return res;
    }
}
