/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

// Time Complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/n-ary-tree-postorder-traversal/

class Solution {
    List<Integer> ans = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if(root == null) {
            return ans;
        }

        List<Node> nodes = root.children;
        for(int i=0; i<nodes.size(); i++) {
            postorder(nodes.get(i));
        }

        ans.add(root.val);

        return ans;
    }


}
