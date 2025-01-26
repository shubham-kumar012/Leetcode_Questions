// Q.1022 Easy
// Leetcode - https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description

// T.C. -> O(n)
// S.C. -> O(h) , where h is height of a tree
class Solution {

     private int sumRoot(TreeNode root, int bin) {
        // Base case: if the current node is null, return 0
        if (root == null) {
            return 0;
        }
        // Update the current binary number
        bin = bin * 2 + root.val;
        // If it's a leaf node, return the binary number as the sum
        if (root.left == null && root.right == null) {
            return bin;
        }
        // Recursively sum the values from the left and right subtrees
        return sumRoot(root.left, bin) + sumRoot(root.right, bin);
    }

    public int sumRootToLeaf(TreeNode root) {
        return sumRoot(root,0);
    }
}
