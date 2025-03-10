// Q.3467 Easy
// Leetcode - https://leetcode.com/problems/transform-array-by-parity/description/

class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length; 
        

        // Method 1 - Without sort function
        // T.C. -> O(n)
        // S.C. -> O(1)
        // for(int i=0; i<n; i++) {
        //     if(nums[i]%2 == 0) {
        //         nums[i] = 0;
        //     } else {
        //         nums[i] = 1;
        //     }
        // }

        // int countZero = 0;
        // // counting how many zeros are there
        // for(int i=0; i<n; i++) {
        //     if(nums[i] == 0) countZero++;
        // }

        // // now filling array with 1's
        // for(int i=0; i<n; i++) {
        //     nums[i] = 1;
        // }

        // System.out.println(countZero);
        // // now replacing zeros
        // int i = 0;
        // while(i < nums.length && countZero > 0) {
        //     nums[i] = 0;
        //     i++;
        //     countZero--;
        // }

        // return nums;


        // Method - 2 (using sort function)
        // T.C. -> O(n*logn)
        // S.C. -> O(1)
        for(int i=0; i<n; i++) {
            if(nums[i]%2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }

        Arrays.sort(nums);

        return nums;

    }
}
