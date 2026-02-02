// Time Complexity - O(n)
// Space Complexity - O(1)
// Leetcode - https://leetcode.com/problems/restore-finishing-order/

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[friends.length];
        int res_iterator = 0;
        
        for(int i=0; i<friends.length; i++) {
            set.add(friends[i]);
        }

        for(int i=0; i<order.length; i++) {
            if(set.contains(order[i])) {
                res[res_iterator++] = order[i];
            }
        }

        return res;
    }
}
