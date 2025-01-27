// Q.543 Easy
// Leetcode - https://leetcode.com/problems/diameter-of-binary-tree/description

// <---- Method 1 ----> Using alternate height method
// T.C. -> O(n^2)
// S.C. -> O(h)
class Solution {
    public int height(TreeNode root) {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int lDiam = diameterOfBinaryTree(root.left);
        int rDiam = diameterOfBinaryTree(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = lh + rh;

        return Math.max(Math.max(lDiam, rDiam), selfDiam);
    }
}


// <---- Method 2 ----> Using Info data type to calculate both height and diam at the same call
// T.C. -> O(n)
// S.C. -> O(h)
class Solution {
    public class Info {
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public Info calDiam(TreeNode root) {
        if(root == null) {
            return new Info(0,0);
        }

        Info leftInfo = calDiam(root.left);
        Info rightInfo = calDiam(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht);
        int height = Math.max(rightInfo.ht, leftInfo.ht)+1;

        return new Info(diam, height);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return calDiam(root).diam;
    }
}
