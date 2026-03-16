// Time Complexity - O(N)
// Spacce Complexity - O(1)
// Leetcode - https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || cloned == null) {
            return null;
        }
        if(original.val == target.val && cloned.val == target.val) {
            return cloned;
        }

        TreeNode node1 = getTargetCopy(original.left, cloned.left, target);
        TreeNode node2 = getTargetCopy(original.right, cloned.right, target);

        if(node1 == null) return node2;
        return node1;
    }
}
