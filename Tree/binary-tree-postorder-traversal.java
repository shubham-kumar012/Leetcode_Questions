// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/binary-tree-postorder-traversal/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack();

        TreeNode curr = root;
        while(curr != null || !st.isEmpty()) {
            if(curr != null) {
                result.add(curr.val);
                st.push(curr);
                curr = curr.right;
            } else {
                curr = st.pop();
                curr = curr.left;
            }
        }

        Collections.reverse(result);
        return result;
    }
}
