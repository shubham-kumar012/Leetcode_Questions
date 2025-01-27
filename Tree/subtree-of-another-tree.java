// Q.572 Easy
// Leetcode - https://leetcode.com/problems/subtree-of-another-tree/description/

// T.C. -> O(n*m)
// S.C. -> O(n+m)
class Solution {

    boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true; 
        if(root == null || subRoot == null || root.val != subRoot.val) return false; // no-identical conditions

        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right); // if both sides are same so return true 
    }

    // <---- Main Function ---->
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) { // base case
            return false;
        }

        if(root.val == subRoot.val) {
            if(isIdentical(root, subRoot)) { // check for identical
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
