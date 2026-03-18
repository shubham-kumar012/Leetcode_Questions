// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/evaluate-boolean-binary-tree/description/

class Solution {
    public boolean evaluateTree(TreeNode root) {
        if(root == null) return false;
        if(root.val == 1) return true;
        if(root.val == 0) return false;

        boolean leftNode = evaluateTree(root.left);
        boolean rightNode = evaluateTree(root.right);

        // if val is 3 then 'AND' operation, else it definately 2 then 'OR' operation
        return root.val == 3 ? leftNode & rightNode : leftNode || rightNode;
    }
}
