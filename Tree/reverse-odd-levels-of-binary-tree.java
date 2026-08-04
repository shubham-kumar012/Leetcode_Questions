// Time Complexity - O(N)
// Space Complexity - O(H)- height of tree, because of recursion stack
// Leetcode - https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left, root.right, 1);
        return root;
    }

    public void reverse(TreeNode node1, TreeNode node2, int level) {
        if(node1 == null || node2 == null) {
            return;
        }

        if(level % 2 == 1) { // even
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }

        reverse(node1.left, node2.right, level+1);
        reverse(node1.right, node2.left, level+1);
    }
}
