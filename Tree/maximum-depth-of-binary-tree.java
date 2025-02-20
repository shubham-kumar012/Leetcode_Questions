// Q.104 Easy
// Leetcode - https://leetcode.com/problems/maximum-depth-of-binary-tree/

// T.C. -> O(n)
// S.C. -> O(h) = h(height of tree)
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = maxDepth(root.left); // calculate left depth
        int rightDepth = maxDepth(root.right); // calculate right depth

        return Math.max(leftDepth, rightDepth) + 1; // we add 1 because we have to consider curr node as well
    }
}
