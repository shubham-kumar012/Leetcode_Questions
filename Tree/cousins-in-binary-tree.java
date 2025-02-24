// Q.993 Easy
// Leetcode - https://leetcode.com/problems/cousins-in-binary-tree/

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    
    // It store info of a node's parent and depth
    class NodeInfo {
        TreeNode parent;
        int depth;
        NodeInfo(TreeNode parent, int depth) {
            this.parent = parent;
            this.depth = depth;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        NodeInfo infoX = getParentAndDepth(root, x, null, 0);
        NodeInfo infoY = getParentAndDepth(root, y, null, 0);

        // Nodes should be at the same depth but have different parents
        //       parent's not equal to null               &&     depth should be same     &&   parent's should not be equal
        return infoX.parent != null && infoY.parent != null && infoX.depth == infoY.depth && infoX.parent != infoY.parent;
    }
    
    private NodeInfo getParentAndDepth(TreeNode root, int n, TreeNode parent, int depth) {
        if(root == null)  {
            return null;
        }

        if(root.val == n) {
            return new NodeInfo(parent, depth);
        }

        NodeInfo left = getParentAndDepth(root.left, n, root, depth+1);
        NodeInfo right = getParentAndDepth(root.right, n, root, depth+1);

        if(left != null) {
            return left;
        }

        return right;
    }
}
