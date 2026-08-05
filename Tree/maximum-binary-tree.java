// Time Complexity - O(N^2)
// Space Complexity - O(N^2)
// Leetcode - https://leetcode.com/problems/maximum-binary-tree/

class Solution {
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(new TreeNode(-1), nums);
    }

    public TreeNode solve(TreeNode node, int[] nums) {
        if(nums.length == 0) return null;

        int maxIdx = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        node.val = nums[maxIdx];

        int[] prefix = new int[maxIdx];
        for(int i=0; i<maxIdx; i++) {
            prefix[i] = nums[i];
        }

        int[] suffix = new int[nums.length - maxIdx - 1];
        for(int i=0; i<suffix.length; i++) {
            suffix[i] = nums[maxIdx + i + 1];
        }

        // prefix node
        TreeNode pr = solve(new TreeNode(-1), prefix);
        // suffix node
        TreeNode sf = solve(new TreeNode(-1), suffix);

        // connect nodes with current tree
        node.left = pr;
        node.right = sf;

        return node;
    }

    
}
