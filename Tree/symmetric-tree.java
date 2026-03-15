// Time Complexity - O(N)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/symmetric-tree/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.offer(root);
        q2.offer(root);

        while(!q1.isEmpty() && !q2.isEmpty()) {
         
            TreeNode lm = q1.poll(); // left mirror
            TreeNode rm = q2.poll(); // right mirror

            if(lm == null && rm == null) continue;
            if(lm == null || rm == null) return false;
            if(lm.val != rm.val) return false;

            q1.offer(lm.left);
            q2.offer(rm.right);

            q1.offer(lm.right);
            q2.offer(rm.left);
        }

        return true;
    }
}
