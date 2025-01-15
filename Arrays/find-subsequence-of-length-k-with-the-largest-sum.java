// Q.2099 Easy
// Leetcode - https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description

// T.C. - O(n*logk)
// S.C. - O(k)
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] res = new int[k];
        int[] index = new int[k]; // Array to store the index of chosen element
        int j = 0; // iterator for index array
        // priority queue to keep track of smalles k element with indices
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int i = 0; i < nums.length; i++) {
            pq.add(new int[] {nums[i], i});
            if(pq.size() > k) { // if there more than k element then remove it
                pq.poll();
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        // Extract the elements and there indices from the prioriy queue
        while(!(pq.isEmpty())) {
            int[] temp = pq.poll();
            map.put(temp[1], temp[0]); // Store the index as the key and element as the value
            index[j++] = temp[1]; // Store the index to the index array 
        }

        Arrays.sort(index); // sort the indices array to maintain the order of elements as they appear in original array
        // sort the index array
        for(int i = 0; i < k; i++) {
            res[i] = map.get(index[i]);
        }

        return res;
    }
}
