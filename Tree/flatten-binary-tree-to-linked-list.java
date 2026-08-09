// Time Complexity - O(N)
// Space Complexity - O(N)
// Leetcode - https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

// By changing values
class Solution {
    ArrayList<Integer> preOrderd = new ArrayList<>();
    public void flatten(TreeNode root) {
        preOrderTraversal(root);

        TreeNode temp = root;
        for(int i=1; i<preOrderd.size(); i++) {
            int val = preOrderd.get(i);
            TreeNode t = new TreeNode(val);
            temp.right = t;
            temp.left = null;
            temp = temp.right;
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if(node == null) return;

        preOrderd.add(node.val);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}

// Method 2 - direct changing the nodes, without changing value
class Solution {
    public void flatten(TreeNode root) {
        List<TreeNode> preOrdered = new ArrayList<TreeNode>();
        preOrderTraversal(root, preOrdered);

        for(int i=1; i<preOrdered.size(); i++) {
            TreeNode prev = preOrdered.get(i-1);
            TreeNode curr = preOrdered.get(i);
          
            prev.left = null;
            prev.right = curr;
        }
    }

    public void preOrderTraversal(TreeNode node, List<TreeNode> preOrdered) {
        if(node == null) return;

        preOrdered.add(node); // there we stored the reference of the node as in the pre order way
        preOrderTraversal(node.left, preOrdered);
        preOrderTraversal(node.right, preOrdered);
    }
}
