// Time Complexity - O(N)
// Space Complexity - O(H)
// Leetcode - https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

class Solution {
    int res = 0;
    public int sumEvenGrandparent(TreeNode root) {
        // solve(root, grandPrt, prt);
        solve(root, -1, -1);
        return res;
    }

    public void solve(TreeNode node, int grandPrt, int prt) {
        if(node == null) return;

        if(grandPrt % 2 == 0) {
            res += node.val;
        }

        solve(node.left, prt, node.val);
        solve(node.right, prt, node.val);
    }
}
