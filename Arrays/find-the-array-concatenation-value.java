// Q.2562 Easy
// Leetcode - https://leetcode.com/problems/find-the-array-concatenation-value/description

// T.C. ->O(n*logm)
// S.C. ->O(1)
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n = nums.length;
        long concat = 0;
        int i=0;
        int j=n-1;

        while(i<=j) { // O(n/2)
            String s = "";
            if(i==j) {
                s = Integer.toString(nums[i]); // O(logm)
            } else {
                s = Integer.toString(nums[i]) + Integer.toString(nums[j]); // O(logm)
            }
            
            concat += (long)Integer.parseInt(s); // O(longm)
            i++;
            j--;
        }
        return concat;
    }
}
