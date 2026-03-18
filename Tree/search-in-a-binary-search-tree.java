// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/search-in-a-binary-search-tree/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;

        TreeNode node1 = searchBST(root.left, val);
        TreeNode node2 = searchBST(root.right, val);

        return (node1 == null) ? node2 : node1;
    }
}
