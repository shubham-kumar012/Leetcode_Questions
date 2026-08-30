class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;
        if(n == 1 || n == 2) {
            return n;
        }

        for(int i=1; i<n; i++) {
            min = (nums[i] < nums[min]) ? i : min;
            max = (nums[i] > nums[max]) ? i : max;
        }


        int left = Math.min(min, max);
        int right = Math.max(min, max);

        // Remove both from the left
        int removeFromLeft = right + 1;

        // Remove both from the right
        int removeFromRight = n - left;

        // Remove one from left and one from right
        int removeFromBoth = (left + 1) + (n - right);

        return Math.min(
            removeFromLeft,
            Math.min(removeFromRight, removeFromBoth)
        );
    }
}
