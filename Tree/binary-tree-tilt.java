// Q.563 Easy
// Leetcode - https://leetcode.com/problems/binary-tree-tilt/

// T.C. -> O(n)
// S.C. -> O(h) - h(height of tree)
class Solution {
    private int ansSum = 0;

    int solve(TreeNode root) {
        if(root == null) return 0; // if root are null

        int leftSum = solve(root.left); // store leftsubtree sum
        int rightSum = solve(root.right); // store rightsubtree sum
        ansSum += Math.abs(leftSum - rightSum); // storing our abs diff of leftsum and rightsum
        int totalSum = leftSum + rightSum + root.val; // the total sum of left, right, curr

        return totalSum;
    }

    public int findTilt(TreeNode root) {
        solve(root); // calling solve funcn

        return ansSum;
    }
}
