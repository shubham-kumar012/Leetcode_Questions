// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

class Solution {
    int sum = 0;

    public void convertTree(TreeNode node) {
        if(node == null) return;

        convertTree(node.right);
        sum += node.val;
        node.val = sum;
        convertTree(node.left);

    }

    public TreeNode bstToGst(TreeNode root) {
        convertTree(root);

        return root;
    }
}
