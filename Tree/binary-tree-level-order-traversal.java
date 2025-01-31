// Q.102 Medium
// Leetcode - https://leetcode.com/problems/binary-tree-level-order-traversal/description/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res; // handle null root case

        Queue<TreeNode> q = new LinkedList<>(); // making queue for BFS
        // add first level to queue
        q.add(root);
        q.add(null);
        res.add(new ArrayList<>());

        // add rest of all nodes
        int i = 0;
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr == null) {
                if(q.isEmpty()) break;
                q.add(null);
                res.add(new ArrayList<>()); // Making new level whenver curr is null
                i++;
            } else {
                res.get(i).add(curr.val); // added node val to that level
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }

        return res;
    }
}
