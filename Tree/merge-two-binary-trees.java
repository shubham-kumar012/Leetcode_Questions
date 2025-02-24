// Q.617 Easy
// Leetcode - https://leetcode.com/problems/merge-two-binary-trees/description

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // base case
        if(root1 == null && root2 == null) {
            return null;
        }

        if(root1 == null) return root2; 
        if(root2 == null) return root1;

        root1.val = root1.val + root2.val; // merge the values

        root1.left = mergeTrees(root1.left, root2.left); // call for left
        root1.right = mergeTrees(root1.right, root2.right); // call for right

        return root1;
    }
}
