// Leetcode - https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
// Time Complexity - O(N)
// Space Complexity - balance - O(logN) / skewed - O(N)

class Solution {
    int res = 0;

    public int averageOfSubtree(TreeNode root) {
        calculateAverage(root);
        return res;
    }

    public int[] calculateAverage(TreeNode root) {
        if(root == null) {
            return new int[]{0, 0}; // {sum, count}
        }

        int[] left = calculateAverage(root.left);
        int[] right = calculateAverage(root.right);

        int sum = left[0] + right[0] + root.val; // sum
        int count = left[1] + right[1] + 1; // count

        if((sum / count) == root.val) {
            res++;
        }

        return new int[]{sum, count};
    }
}
