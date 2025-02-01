// Q.450 Medium
// Leetcode - https://leetcode.com/problems/delete-node-in-a-bst/description/

// T.C. -> O(logn)->(balanced) | O(n)->(skewed)
// S.C. -> O(logn)->(balanced) | O(n)->(skewed)
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null; // if node is null -> return null

        if(root.val > key) { // if key exist in left subtree so delete from left tree connect it to root's left
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key) { // if key exist in right subtree so delete from right tree connect it to root's right
            root.right = deleteNode(root.right, key);
        } 
        else { // if Node found
            // case 1 : No Child()
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2 : Single Child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }
            // case 3 : Two Child
            if(root.left != null && root.right != null) {
                TreeNode IS = findInorderSuccessor(root.right); // Inorder Successor -> left most node of right subtree
                root.val = IS.val;
                root.right = deleteNode(root.right, IS.val);
            }
        }
        return root;
    }
    public TreeNode findInorderSuccessor(TreeNode root) {
        while(root.left != null) { // find last left node of this tree
            root = root.left;
        }
        return root; // return -> leftmost node
    }
}
