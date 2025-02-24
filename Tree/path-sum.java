// Q.112 Easy
// Leetcode - https://leetcode.com/problems/path-sum/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false; // if root are null so return false

        return solve(root, targetSum, 0);
    }

    private boolean solve(TreeNode root, int targetSum, int currSum) {
        if(root == null) {
            return false;
        }

        currSum += root.val;

        if(root.left == null && root.right == null) {
            return targetSum == currSum;
        }

        boolean left = solve(root.left, targetSum, currSum);
        boolean right = solve(root.right, targetSum, currSum);

        return left || right;
    }
}
