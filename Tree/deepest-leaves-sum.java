// Time Complexity - O(N)
// Space Complexity - O(H)
// Leetcode - https://leetcode.com/problems/deepest-leaves-sum/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxLevel = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        if(root == null) return 0;

        calDeepestLeaveSum(root, 0);
        return sum;
    }

    public void calDeepestLeaveSum(TreeNode root, int level) {
        if(root == null) return;

        if(level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }
        if(level == maxLevel) {
            sum += root.val;
        }

        calDeepestLeaveSum(root.left, level+1);
        calDeepestLeaveSum(root.right, level+1);
    }
}
