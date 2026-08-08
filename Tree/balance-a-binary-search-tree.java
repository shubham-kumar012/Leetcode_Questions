// Time Complexity - O(N)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/balance-a-binary-search-tree/

class Solution {
    ArrayList<Integer> sortedVal = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        buildSortedArray(root);

        return buildTree(0, sortedVal.size()-1);
    }

    public void buildSortedArray(TreeNode root) {
        if(root == null) return;

        buildSortedArray(root.left);
        sortedVal.add(root.val);
        buildSortedArray(root.right);
    }

    public TreeNode buildTree(int start, int end) {
        if(start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(sortedVal.get(mid));

        root.left = buildTree(start, mid-1);
        root.right = buildTree(mid+1, end);

        return root;
    }
}
