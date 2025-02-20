// Q.100 Easy
// Leetcode - https://leetcode.com/problems/same-tree/

// S.C. -> O(n)
// T.C. -> worst-case - O(n), balanced tree - O(logn) 
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true; // if Both tree root are null
        if(p == null || q == null || p.val != q.val) return false; // if anyone of the tree root are null or values are not the same
        
        boolean leftSubtree = isSameTree(p.left, q.left); // check for leftsubtree for both
        boolean rightSubtree = isSameTree(p.right, q.right); // chech for rightsubtree for both

        return leftSubtree && rightSubtree; // if both left and right subtree return true so, they are same
    }
}
