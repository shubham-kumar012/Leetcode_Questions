// Q.889 Medium
// Leetcode - https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal

// T.C. -> O(n^2)
// S.C. -> O(n)
class Solution {

    public TreeNode solve(int preStart, int postStart, int preEnd, int[] preorder, int[] postorder) {
        if(preStart > preEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]); // create root node

        if(preStart == preEnd) return root; // if prestart are the last node

        int nextNode = preorder[preStart + 1]; // root of left subtree

        int j = postStart;
        while(postorder[j] != nextNode) {
            j++;
        }

        int num = (j - postStart) + 1; // no of node

        root.left = solve(preStart+1, postStart, preStart+num, preorder, postorder);
        root.right = solve(preStart+num+1, j+1, preEnd, preorder, postorder);

        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
                // solve(preSt, postSt, preEnd, preorder, postorder)
        return solve(0, 0, n-1, preorder, postorder);
    }
}
