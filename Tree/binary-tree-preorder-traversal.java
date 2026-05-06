// Time Complexity - O(n) - number of nodes
// Space Complexity - O(n) - recursive call stack
// Leetcode - https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        
        callAnswer(root);

        return result;
    }

    public void callAnswer(TreeNode root) {
        if(root == null) return;

        result.add(root.val);
        callAnswer(root.left);
        callAnswer(root.right);
    }
}
