// Time Complexity - O(N), N => total no. of nodes in tree
// Space Complexity - O(N), N => for wrost case (skewed tree)
// Leetcode - https://leetcode.com/problems/minimum-depth-of-binary-tree/

class Solution {
    int ans = Integer.MAX_VALUE;

    public void calMinDept(TreeNode curr, int dept) {
        // base case
        if(curr.left == null && curr.right == null) {
            ans = Math.min(ans, dept);
            return;
        }

        if(curr.left != null) {
            calMinDept(curr.left, dept + 1);
        }

        if(curr.right != null) {
            calMinDept(curr.right, dept + 1);
        }
    }

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        calMinDept(root, 1);
        return ans;
    }
}
