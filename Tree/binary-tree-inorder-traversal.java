// Q.94 Easy
// Leetcode - https://leetcode.com/problems/binary-tree-inorder-traversal/description

// T.C. -> O(n)
// S.C. -> O(h + n), (h = height of a tree, n = no. of nodes)
class Solution {
    public void inOrder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }

        inOrder(root.left,res);
        res.add(root.val);
        inOrder(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }
}
